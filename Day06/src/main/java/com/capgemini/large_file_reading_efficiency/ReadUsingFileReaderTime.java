package com.capgemini.large_file_reading_efficiency;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadUsingFileReaderTime {
    public static void readUsingFileReader(String filePath){
        String myFilePath =  "src/main/java/com/capgemini/large_file_reading_efficiency/" + filePath;
        try(java.io.FileReader fileReader = new java.io.FileReader(myFilePath);
            BufferedReader reader = new BufferedReader(fileReader)){
            String line;
            while((line = reader.readLine()) != null){

            }

        }
        catch (FileNotFoundException e){
            System.out.println("Exception occurred file not found "+ e.getMessage());
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}
