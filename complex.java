import java.util.Scanner;
public class complex {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the values of first Complex Number(i and j value):");
        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println("Enter  the values of second Complex Number(i and j value):");
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println("sum of complex numbers:"+(i+m)+" + "+(j+n)+"i");
        
    }
}
