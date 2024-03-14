import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class FileIOTask2_3 {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("./resources/T02_input.txt"));
            PrintWriter pw = new PrintWriter("./resources/T02_output.txt");
            String line = "";
            
            while ((line = br.readLine()) != null) {
                String word = "";
                for (int i = line.length() - 1; i >= 0; i--) {
                    if (Character.isAlphabetic(line.charAt(i))) {
                        word += Character.toUpperCase(line.charAt(i));
                    }
                }
                pw.println(word);
            }
            
            pw.close();

        } catch (Exception e) {

        }
    }
}