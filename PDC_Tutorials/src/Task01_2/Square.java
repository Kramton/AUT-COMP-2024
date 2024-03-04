/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task01_2;

/**
 *
 * @author mark
 */
public class Square {
    double side;
    
    public Square(double sl)
    {
        super(sl);
        this.side = sl;
    }
    
    public void calculateArea()
    {
        this.area = this.side * this.side;
    }
}
