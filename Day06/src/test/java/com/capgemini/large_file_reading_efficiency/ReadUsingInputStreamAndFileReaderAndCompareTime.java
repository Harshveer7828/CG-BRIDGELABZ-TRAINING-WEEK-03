package com.capgemini.large_file_reading_efficiency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReadUsingInputStreamAndFileReaderAndCompareTime {
    @Test
    void ReadUsingInputStreamAndFileReaderTest1(){
        long start1 = System.nanoTime();
        ReadUsingFileReaderTime.readUsingFileReader("demo_txt");
        long end1 = System.nanoTime();
        long meanTimeOfFileReader = end1 - start1;

        long start2 = System.nanoTime();
        ReadUsingInputStreamTime.readUsingInputStreamReader("demo_txt");
        long end2 = System.nanoTime();
        long meanTimeOfInputStreamReader = end2 - start2;

        assertTrue(meanTimeOfInputStreamReader < meanTimeOfFileReader);
    }

}
