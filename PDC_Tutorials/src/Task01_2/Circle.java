package Task01_2;

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