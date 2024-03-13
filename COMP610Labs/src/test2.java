
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mark
 */
public class test2 {

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("/Users/mark/Documents/GitHub/AUT-COMP-2024/PDC_Tutorials/resources/T02_input.txt");
            BufferedReader inputStream = new BufferedReader(fr);
            String line = null;
            int count = 0;
            
            String line1 = "";
            String line2 = "";
            String reverse = "";
            while ((line = inputStream.readLine()) != null) {
                count++;
                
                if(count == 1)
                {
                    line1 += line;
                }
                else if(count == 2)
                {
                    line2 += line;
                    break;
                }
            }
            System.out.println(line1);
            System.out.println(line2);
            
            for (int i = 0; i < line1.length(); i++) {
                reverse = line1.charAt(i) + reverse;
            }
            System.out.println(reverse);
            
            for (int i = 0; i < line2.length(); i++) {
                reverse = line2.charAt(i) + reverse;
            }
            System.out.println(reverse);

            inputStream.close();
                    
//            BufferedReader br = new BufferedReader(new FileReader("/Users/mark/Documents/GitHub/AUT-COMP-2024/PDC_Tutorials/resources/T02_input.txt"));
//            String line = br.readLine();
//            int lineCount = 0;
//
//            while (line != null) {
//                System.out.println(line);
//                lineCount++;
//            }
//            
//            br.close();
//            
        } catch (Exception e) {
            
        }
    }
}
