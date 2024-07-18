package Graphics;
public class Square implements Figure
{
double length;
public Square(double le)
{
length=le;
}
public void area(){
System.out.println("Area of Square: " +(length*length));
}
}