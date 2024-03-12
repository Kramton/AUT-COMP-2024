
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mark
 */
public class test 
{
    public static void main(String[] args) {
//        String originalStr = "Hello";
//        String reversedStr = "";
//        System.out.println("Original string: " + originalStr);
//
//        for (int i = 0; i < originalStr.length(); i++) {
//            reversedStr = originalStr.charAt(i) + reversedStr;
//        }
//
//        System.out.println("Reversed string: " + reversedStr);

          String str = "abc,.def,hij,klm";
          StringTokenizer st = new StringTokenizer(str, " \n.,");
          while(st.hasMoreTokens()){
              System.out.println(st.nextToken());
          }
          
          str="abc,,,,,dec. xyz:txt*****aaa.bbb";
          Scanner sc = new Scanner(str);
          sc.useDelimeter("");
          while(sc.hasNext()){
              System.out.println(sc.next());
          }
    }
}