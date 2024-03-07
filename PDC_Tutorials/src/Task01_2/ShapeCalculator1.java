package Task01_2;

public class ShapeCalculator1 
{
    public static void main(String[] args)
    {
        Shape cirObj = new Circle(2.5);
        Shape recObj = new Rectangle(12, 16.5);
        Rectangle squObj = new Square(3.3);
        
        cirObj.calculateArea();
        cirObj.printInfo();
        
        recObj.calculateArea();
        recObj.printInfo();
        
        squObj.calculateArea();
        squObj.printInfo();
    }
}
