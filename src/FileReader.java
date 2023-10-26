import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader {
    public static void main(String[] args){

        //1- name the file
        File file =new File("file.csv");


        //2- create file
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


        // 3- write into file
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("created file 2");
            for (int i =0 ; i<=5 ;i++){
                fileWriter.append("\nhi"+i);
            }
            fileWriter.flush();
            fileWriter.close();

            // 4- read from file
            BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(file));
            // 5 - read from lines in file
            String line;
            while ((line= bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
