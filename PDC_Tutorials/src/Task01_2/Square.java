/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task01_2;

/**
 *
 * @author mark
 */
public class Square extends Rectangle
{
    double sideLength;
    
    public Square(double sideLength)
    {
        super(sideLength);
        this.sideLength = sideLength;
    }
    
    public void calculateArea()
    {
        this.area = this.sideLength * this.sideLength;
    }
}
