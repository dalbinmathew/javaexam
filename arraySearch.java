import java.util.Scanner;
class arraySearch
{
    public static void main(String args[])
    {
        boolean flag=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("enter the element "+(i+1)+":");
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the element you want to search:");
        int ele = sc.nextInt();
        for(int i=0;i<size;i++)
        {
            if (arr[i]==ele)
            {
                flag=true;
            }
        }
        if(flag==true)
        System.out.println("element is present in the array");    
        else    
        System.out.println("element is not present in the array");
    }
}