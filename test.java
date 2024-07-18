import java.util.*;
import Graphics.*;
class test {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int ch;
        do
        {
            System.out.print("------------------\n1.Circle\n2.Rectangle\n3.Square\n4.Traingle\n5.Exit\n------------------\nEnter your choice: ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                        System.out.print("Enter radius of circle: ");
                        double r=sc.nextDouble();
                        Circle c =new Circle(r);
                        c.area();
                        break;
                case 2:
                        System.out.print("Enter length and breadth of rectangle: ");
                        double l=sc.nextDouble();
                        double b=sc.nextDouble();
                        Rectangle r1 =new Rectangle(l,b);
                        r1.area();                       
                        break;
                case 3:
                        System.out.print("Enter length of square: ");
                        double le=sc.nextDouble();
                        Square s =new Square(le);
                        s.area();
                        break;
                case 4:
                        System.out.print("Enter breadth and height of rectangle: ");
                        double br=sc.nextDouble();
                        double h=sc.nextDouble();
                        Triangle t =new Triangle(br,h);
                        t.area();                       
                        break;
                case 5:
                        System.out.println("Exiting...");
                        break;
                default:
                        System.out.println("Invalid choice!");
            }
        }while(ch!=5);
    }
}