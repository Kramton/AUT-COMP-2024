/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task01_2;

/**
 *
 * @author mark
 */
public class Circle extends Shape
{
    double radius;
    
    public Circle(double radius) 
    {
        super("Circle");
        this.radius = radius;
    }
    
    public void calculateArea()
    {
        // area of circle = pi * radius * radius
        this.area = radius * radius * Math.PI;
    }
}