package Task01_2;

public class Rectangle extends Shape
{
    double length, width;
    
    public Rectangle(double length, double width) 
    {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }
    
    public Rectangle(double sideLength)
    {
        super("Square");
        sideLength = sideLength;
        width = sideLength;
    }
    
    public void calculateArea()
    {
        this.area = this.length * this.width;
    }
}