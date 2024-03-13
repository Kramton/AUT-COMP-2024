
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class test3 {

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("/Users/mark/Documents/GitHub/AUT-COMP-2024/PDC_Tutorials/resources/T02_input.txt");
            BufferedReader inputStream = new BufferedReader(fr);
            char line = ' ';
            int count = 0;
            
            String line1 = "";
            String line2 = "";
            String reverse = "";
            while ((inputStream.read()) != 's') {
                count++;
                System.out.print(line);
                
//                if(count == 1)
//                {
//                    line1 += line;
//                }
//                else if(count == 2)
//                {
//                    line2 += line;
//                    break;
//                }
            }
            System.out.println(line1);
            System.out.println(line2);
            System.out.println("============Reversed===============");
            
            for (int i = 0; i < line1.length(); i++) {
                reverse = line1.charAt(i) + reverse;
            }
            System.out.println(reverse);
            
            for (int i = 0; i < line2.length(); i++) {
                reverse = line2.charAt(i) + reverse;
            }
            System.out.println(reverse);

            inputStream.close();
   
        } catch (Exception e) {
            
        }
    }
}
