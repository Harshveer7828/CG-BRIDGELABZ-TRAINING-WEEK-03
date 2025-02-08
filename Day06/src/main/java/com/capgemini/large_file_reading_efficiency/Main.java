package com.capgemini.large_file_reading_efficiency;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        long start1 = System.nanoTime();
        ReadUsingFileReaderTime.readUsingFileReader("demo_txt");
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        ReadUsingInputStreamTime.readUsingInputStreamReader("demo_txt");
        long end2 = System.nanoTime();

        System.out.println("Time Taken by File Reader: "+ TimeUnit.NANOSECONDS.toMillis(end1-start1));
        System.out.println("Time Taken by Input Stream Reader: "+TimeUnit.NANOSECONDS.toMillis(end2-start2));
    }
}
