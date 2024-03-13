import java.io.BufferedReader;
import java.io.FileReader;

public class FileIOTask2_3 {

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("/Users/mark/Documents/GitHub/AUT-COMP-2024/PDC_Tutorials/resources/T02_input.txt");
            BufferedReader inputStream = new BufferedReader(fr);
            String line = null;
            int count = 0;

            // the most stupid way to solve this task...
            String[] word = new String[2];

            while ((line = inputStream.readLine()) != null) {
                count++;

                if (count == 1) {
                    word[0] = line;
                } else if (count == 2) {
                    word[1] = line;
                    break;
                }
            }

            System.out.println(reverseLine(word[0]).toUpperCase() + "\n");
            System.out.println(reverseLine(word[1]).toUpperCase());

            inputStream.close();

        } catch (Exception e) {

        }

    }

    public static String reverseLine(String line) {

        String reverse = "";
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'a' || line.charAt(i) == 'U' || line.charAt(i) == 't'
                    || line.charAt(i) == 'E' || line.charAt(i) == 'c' || line.charAt(i) == 'm' || line.charAt(i) == 's') {
                reverse = line.charAt(i) + reverse;
            }
        }

        return reverse;
    }
}