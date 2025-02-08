package com.capgemini.large_file_reading_efficiency;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReadUsingInputStreamTime {
    public static void readUsingInputStreamReader(String filepath){
        String myFilePath =  "src/main/java/com/capgemini/large_file_reading_efficiency/" + filepath;
        try(FileInputStream fileInputStream = new FileInputStream(myFilePath);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            BufferedReader reader = new BufferedReader(inputStreamReader)){
            String line;
            while((line = reader.readLine()) != null){}

        }
        catch (FileNotFoundException e){
            System.out.println("Exception occurred file not found "+ e.getMessage());
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
