/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp610labs;

/**
 *
 * @author mark
 */
public class Lab01Q2 
{
    public static void main(String[] args) 
    {
        int[] numberList = {1, 2, 4, 5};

        insertToArray(3, numberList, numberList.length);
        
        for(int i = 0; i < numberList.length; i++)
        {
            System.out.print(numberList[i] + ", ");
        }
    }

    public static void insertToArray(int number, int[] list, int size) 
    {
        int index = 0;

        //to find right position for inserting a number and position will be stored in the index
        for (; index <= list.length; index++) 
        {
            if(list[index] > number)
            {
                break;
            }
        }

        // shift numbers to make space to insert a new number
        for (int i = list.length - 2; i >= index; i--) 
        {
            list[i + 1] = list[i];
        }
        
        // insert a new number
        list[index] = number;
    }
}
