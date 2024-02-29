/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp610;

/**
 *
 * @author mark
 */
public class Lab01_Q2 
{
    public static void main(String[] args)
    {
        int[] numbers = {1, 2, 4, 5};

        InsertToArray(3, numbers, numbers.length);

        System.out.println(numbers);
    }
    public static void InsertToArray(int number, int[] list, int size)
    {
        int index = 0;

        // to find the right position for inserting a number and position will be stored in index.
        for(int i = 0; i < index; i++);

        // shift numbers to make space to insert a new number.
        for(int i = 0; i < index; i++)
        {
            list[i] = index;
        }
        
        // insert a new number.
        list[index] = number;
    }
}