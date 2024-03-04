/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task01_2;

/**
 *
 * @author mark
 */
public class Rectangle extends Shape
{
    double length, width;
    
    public Rectangle(double length, double width) 
    {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }
    
    public Rectangle(double sidelength)
    {
        super("Sqaure");
        sidelength = sidelength;
        width = sidelength;
    }
    
    public void calculateArea()
    {
        // area = base * height
        this.area = this.length * this.width;
    }
}