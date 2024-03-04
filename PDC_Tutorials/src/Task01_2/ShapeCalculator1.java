/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task01_2;

/**
 *
 * @author mark
 */
public class ShapeCalculator1 
{
    public static void main(String[] args)
    {
        Shape cirObj = new Circle(2.5);
        Shape recObj = new Rectangle(12, 16.5);
        
        cirObj.calculateArea();
        cirObj.printInfo();
        
        recObj.calculateArea();
        recObj.printInfo();
        
        

    }
}
