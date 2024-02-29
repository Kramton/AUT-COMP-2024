/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comp610;

/**
 *
 * @author mark
 */
public class Lab01_Q1 
{

    /**
     * @param args the command line arguments
     */	
	public static void main(String[] args) 
    {
       diamond(6, 6);
    }
    
	// prints the *
    public static void repeatlyPrint(int amount, String pattern)
    {
        if(amount > 0)
        {
            System.out.print(pattern);
            
            repeatlyPrint(amount - 1, pattern);
        }
    }
    
    // prints the shape
    public static void diamond(int totalHeight, int currentRow)
    {
        repeatlyPrint(totalHeight, " ");
        repeatlyPrint(totalHeight - currentRow, "*" + " ");
        
        if(totalHeight > 0)
        {
            diamond(totalHeight - 1, currentRow + 1);
        }
        
        repeatlyPrint(totalHeight - currentRow, " ");
        repeatlyPrint(totalHeight, "*" + " ");
        
        System.out.println("");
    }
}