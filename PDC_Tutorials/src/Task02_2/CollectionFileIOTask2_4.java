package Task02_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CollectionFileIOTask2_4 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("/Users/mark/Documents/GitHub/AUT-COMP-2024/PDC_Tutorials/resources/T02_scores.txt");
            BufferedReader inputStream = new BufferedReader(fr);
            
            ArrayList<String> scoreList = new ArrayList<>();
            
            String line = null;
            String score = "";
            
            while((line = inputStream.readLine()) != null) {
                score = line;
                scoreList.add(score);
            }
            
            System.out.println("Existing Marks: ");
            
            int count = 0;
            while (scoreList.isEmpty() != true) {
                System.out.println(scoreList.get(count));
                count++;
            }
            
            StringTokenizer st = new StringTokenizer(score);
            
            while(st.hasMoreTokens()) {
                System.out.println(st.nextToken());
            }
            
            inputStream.close();
        } catch (Exception e) {

        }
    }
}