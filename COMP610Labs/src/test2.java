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
 public static void main(String[] args) { 

        diamond(6, 6); 

    } 

 

    public static void repeatlyPrint(int amount, String pattern) { 

        if (amount > 0) { 

            // print a pattern once 

            System.out.print(pattern); 

            // recursively call the function itself 

            repeatlyPrint(amount - 1, pattern); 

        } 

    } 

 

    public static void diamond(int totalHeight, int currentRow) { 

        repeatlyPrint(currentRow, " "); //print spaces (outside of diamond) 

        repeatlyPrint(totalHeight - currentRow,"*" + " ");//print asterisks and spaces 

        System.out.println(); 

        if (currentRow > 0) { 

            diamond(totalHeight, currentRow -1); 

        } 

        repeatlyPrint(currentRow, " ");//print spaces 

        repeatlyPrint(totalHeight - currentRow,"*" + " ");//print asterisks and spaces 

        System.out.println(); 

    } 
}
