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
        String originalStr = "Hello";
        String reversedStr = "";
        System.out.println("Original string: " + originalStr);

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }

        System.out.println("Reversed string: " + reversedStr);
    }
}