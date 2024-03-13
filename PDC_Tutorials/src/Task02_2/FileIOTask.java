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
            //fileReader.useDelimiter("[^A-Za-z]");
            
            String data = "";
            String reverse = "";
            
            while(fileReader.hasNext()){
                data = fileReader.nextLine();
                reverse += data;
            }
            
            System.out.println(reverse);
            
            String reverse2 = "";
            for(int i = 0; i < reverse.length(); i++)
            {
                reverse2 = reverse.charAt(i) + reverse2;
            }
            
            System.out.println("====================================================");
            
            StringTokenizer st = new StringTokenizer(reverse2, "-+_*k21hgfed9b");
            while(st.hasMoreTokens())
            {
                System.out.println(st.nextToken().toUpperCase());
            }
            
            fileReader.close();
            
        } catch (Exception e) {
            
        }
    }
}
