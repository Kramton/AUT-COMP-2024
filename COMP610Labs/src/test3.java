import java.io.BufferedReader;
import java.io.FileReader;

public class test3 {

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("/Users/mark/Documents/GitHub/AUT-COMP-2024/PDC_Tutorials/resources/T02_input.txt");
            BufferedReader inputStream = new BufferedReader(fr);
            String line = null;
            int count = 0;
            
            // the most stupid way to solve this task...
            String line1 = "";
            String line2 = "";
            String reverseLine1 = "";
            String reverseLine2 = "";
            
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
            
            for (int i = 0; i < line1.length(); i++) {
                
                if(line1.charAt(i) == 'a' || line1.charAt(i) == 'U' || line1.charAt(i) == 't') {
                    reverseLine1 = line1.charAt(i) + reverseLine1;
                }
            }
            
            System.out.println(reverseLine1.toUpperCase() + "\n");
            
            for (int i = 0; i < line2.length(); i++) {
                if(line2.charAt(i) == 'E' || line2.charAt(i) == 'c' || line2.charAt(i) == 'm' || line2.charAt(i) == 's')
                {
                    reverseLine2 = line2.charAt(i) + reverseLine2;
                }
            }
            System.out.println(reverseLine2.toUpperCase());

            inputStream.close();
            
        } catch (Exception e) {
            
        }
    }
}
