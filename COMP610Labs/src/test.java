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
    public static void main(String[] args)
    {
        int row = 3;
        
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j <= row - i; j++)
            {
                System.out.print(" ");
            }
            
            for(int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}