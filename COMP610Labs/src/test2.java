
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mark
 */
public class test2 
{
    public static void main(String[] args) 
    {
          String str="abc,,,,,dec. xyz:txt*****aaa.bbb";
          Scanner scanner = new Scanner(str);
          scanner.useDelimiter(",,*|\\\\. *|: *|\\\\*\\\\*");
          while(scanner.hasNext()){
              System.out.println(scanner.next());
          }
    }
}
