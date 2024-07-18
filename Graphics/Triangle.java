package Graphics;
public class Triangle implements Figure
{
double breadth;
double height;
public Triangle(double br,double h){
height=h;
breadth=br;
}
public void area(){
System.out.println("Area of Triangle: " +(0.5*height*breadth));
}
}