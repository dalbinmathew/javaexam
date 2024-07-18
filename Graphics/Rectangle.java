package Graphics;
public class Rectangle implements Figure 
{
    double length,breadth;
    Rectangle(double l,double b)
    {
        length = l;
        breadth = b;
    }
    public void area()
    {
        System.out.println("Area of rectangle: " +(length*breadth));
    }
}
