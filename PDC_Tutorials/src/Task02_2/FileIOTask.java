package Task02_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FileIOTask {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("./resources/T02_input.txt");
            Scanner fileReader = new Scanner(file);
            fileReader.useDelimiter("[^A-Za-z]");
            
            String data = "";
            String reverse = "";
            
            while(fileReader.hasNext()){
                data = fileReader.nextLine();
                reverse += data;
                System.out.println(data.toUpperCase());
            }
            fileReader.close();
            
            for(int i = 0; i < reverse.length(); i++)
            {
                reverse = data.charAt(i) + reverse;
            }
            
            System.out.println(reverse);
            
        } catch (Exception e) {
            
        }
//        try {
//            BufferedReader inStream = new BufferedReader(new FileReader("./resources/T02_input.txt"));
//            
//            String line = null;
//
//            while((line = inStream.readLine()) != null){
//                System.out.println(line.toUpperCase());
//            }
//            
//            inStream.close();
//            
//        } catch (Exception e) {
//
//        }

    }
}
