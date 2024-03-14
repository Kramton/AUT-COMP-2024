import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class test3 {

    public static void main(String[] args) {
        
        try {
            FileReader fr = new FileReader("/Users/mark/Documents/GitHub/AUT-COMP-2024/PDC_Tutorials/resources/T02_input.txt");
            BufferedReader inputStream = new BufferedReader(fr);
            String line = "";
            
            PrintWriter pw = new PrintWriter(new FileOutputStream("T02_output.txt"));
            
            String[] words = new String[5];
            
            int count = 0;
            while ((line = inputStream.readLine()) != null) {
                
                if(count < 5) {
                    words[count] = line;
                }
                else {
                    break;
                }
                
                count++;
            }
            
            for(int i = 0; i < words.length; i++) {
                pw.println(reverseLine(words[i]).toUpperCase() + "\n");
            }

            inputStream.close();
            pw.close();
            
        } catch (Exception e) {
            
        }
    }
    
    public static String reverseLine(String line) {
        String reverse = "";
        for (int i = 0; i < line.length(); i++) {
            if (true) {
                reverse = line.charAt(i) + reverse;
            }
        }

        return reverse;
    }
}
