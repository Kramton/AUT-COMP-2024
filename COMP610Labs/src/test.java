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
        int[] numbers = {10, 15, 25, 43};

        // Call the method to insert a number into the array
        InsertToArray(7, numbers, numbers.length);

        // Print the array after insertion
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void InsertToArray(int number, int[] list, int size) {
        int index = size; // Initialize index to size (end of the array)

        // Find the right position for inserting a number and store the position in index
        for (int i = 0; i < size; i++) {
            if (list[i] > number) {
                index = i;
                break;
            }
        }

        // Shift numbers to make space to insert the new number
        for (int i = size - 1; i > index; i--) {
            list[i] = list[i - 1];
        }

        // Insert the new number
        list[index] = number;
    }
}