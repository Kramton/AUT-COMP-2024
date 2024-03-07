/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task01_2;

import java.util.Scanner;

/**
 *
 * @author mark
 */
public class ShapeCalculator2 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please select:\n (1) Rectangle\n (2) Circle\n (3) Square\n");

        try 
        {
            int option = scan.nextInt();
            
            switch (option) 
            {
                case 1:
                    System.out.println("Rectangle");
                    System.out.println("Input length: ");
                    double length = scan.nextDouble();
                    System.out.println("Input width: ");
                    double width = scan.nextDouble();
                    
                    Shape recObj = new Rectangle(length, width);
                    recObj.calculateArea();
                    recObj.printInfo();
                    break;
                    
                case 2:
                    System.out.println("Circle");
                    System.out.println("Input radius: ");
                    double radius = scan.nextDouble();
                    
                    Shape cirObj = new Circle(radius);
                    cirObj.calculateArea();
                    cirObj.printInfo();
                    break;
                    
                case 3:
                    System.out.println("Square");
                    System.out.println("Input side length: ");
                    double sideLength = scan.nextDouble();
                    
                    Rectangle squObj = new Square(sideLength);
                    squObj.calculateArea();
                    squObj.printInfo();
                    break;
                    
                default:
                    System.out.println("Wrong input.");
                    break;
            }
        }
        catch(Exception e)
        {
            System.out.println("Invalid input. Not an integer");
        }
    }
}