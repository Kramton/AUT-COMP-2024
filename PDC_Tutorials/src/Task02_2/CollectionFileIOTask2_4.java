package Task02_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CollectionFileIOTask2_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> records = readRecords();
        
        String name = "";
        Integer score = 0;
        
        while(true) {
            System.out.println(records);
            System.out.print("Student Name: ");
            name = checkInput(scan, records);
            boolean isValid = false;
            while (!isValid) {
                try {
                    System.out.print(" idk what this says");
                    score = Integer.parseInt(checkInput(scan, records));
                    isValid = true;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input.");
                }
            }
            
            if (records.containsKey(name)) {
            System.out.println(("The record of " + name + " is existing. Do you want to overwrite? (Y)"));
            if (checkInput(scan, records).trim().equalsIgnoreCase("Y")) {
                records.put(name, score);
            }
        } else {
            records.put(name, score);
            System.out.println("New Record added.");
        }
        }
       
    }
    
    public static void writeToFile(HashMap<String, Integer> records) {
        PrintWriter pw = null;
        
        try {
            pw = new PrintWriter("scores.txt");
            for (Map.Entry<String, Integer> entry : records.entrySet()) {
                pw.println(entry.getKey() + " " + entry.getValue());
            }
        } catch (Exception e){
            
        } finally {
            if(pw != null) {
                pw.close();
            }
        }
    }
    
    public static String checkInput(Scanner scan, HashMap<String, Integer> records) {
        String input = scan.nextLine();
        
        if (input.trim().equalsIgnoreCase("x")) {
            writeToFile(records);
            System.out.println("Saved.");
            System.exit(0);
        }
        
        return input;
    }
    
    public static HashMap<String, Integer> readRecords() {
        HashMap<String, Integer> list = new HashMap();
        BufferedReader br = null;
        
        try {
            br = new BufferedReader(new FileReader("./resources/T02_scores.txt"));
            String line = "";
            
            while((line = br.readLine()) != null) {
                String str[] = line.split(" ");
                list.put(str[0], Integer.parseInt(str[1]));
            }
            
            br.close();
        } catch (Exception e) {
            
        }
        return list;
    }
}