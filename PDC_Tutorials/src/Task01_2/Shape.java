package Task01_2;

import java.text.DecimalFormat;

public abstract class Shape {

    public String shapeName = "";
    public double area = 0;

    public Shape(String name) {
        this.shapeName = name;
    }

    public void printInfo() {
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println(this.shapeName);
        System.out.println(df.format(this.area));
    }

    public void setName(String newName) {
        this.shapeName = newName;
    }

    //please be noted that this is an abstract function
    public abstract void calculateArea();
}
