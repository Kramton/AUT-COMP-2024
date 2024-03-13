package Task02_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class CollectionFileIOTask2_4 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("/Users/mark/Documents/GitHub/AUT-COMP-2024/PDC_Tutorials/resources/T02_scores.txt");
            BufferedReader inputStream = new BufferedReader(fr);
            
            String line = null;
            while((line = inputStream.readLine()) != null) {
                //System.out.println(line);
                
            }
            
            StringTokenizer st = new StringTokenizer(line);
            
            while(st.hasMoreTokens()) {
                System.out.println(st.nextToken());
            }
            
            inputStream.close();
        } catch (Exception e) {

        }
    }
}