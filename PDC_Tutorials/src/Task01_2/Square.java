package Task01_2;

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
