/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comp610labs;

public class Lab01Q1 
{
    public static void main(String[] args) 
    {
       diamond(6, 6);
    }
    
    public static void repeatlyPrint(int amount, String pattern)
    {
        if(amount > 0)
        {
            // prints a pattern once
            System.out.print(pattern);
            
            // recursively call the function itself
            repeatlyPrint(amount - 1, pattern);
        }
    }
    
    // prints the shape
    public static void diamond(int totalHeight, int currentRow)
    {
        // prints spaces outside of diamond
        repeatlyPrint(currentRow, "_");
        
        // prints asterisks and spaces
        repeatlyPrint(totalHeight - currentRow, "*_");
        
        System.out.println();
        
        if(currentRow > 0)
        {
            diamond(totalHeight, currentRow - 1);
        }
        
        // print spaces
        repeatlyPrint(currentRow, "_");
        
        // print asterisks and spaces
        repeatlyPrint(totalHeight - currentRow, "*_");
        
        System.out.println();
    }
}