package file_reader.count_occurrence;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountOccurrence {
    public static int count(String filePath, char word){
        String myPath = "src/main/java/file_reader/count_occurrence/" + filePath;
        int count = 0;

        try{
            BufferedReader br = new BufferedReader(new FileReader(myPath));
            String line;

            try {
                while((line = br.readLine()) != null ){
                    for (int i = 0; i < line.length(); i++) {
                        if (line.charAt(i) == word) count++;
                    }
                }
            }catch (IOException e){
                System.out.println("Error occurred IO Exception" + e.getMessage());
            }
        }catch (FileNotFoundException e){
            System.out.println("Exception occurred File Not Found" + e.getMessage());
        }

        return count;
    }
}
