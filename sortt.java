import java.util.*;
public class sortt{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no: of strings: ");
        int n=sc.nextInt();
        String arr[]=new String[n];
        System.out.print("Enter "+n+" strings: ");
        for(int i=0;i<n;i++)
        arr[i]=sc.next();
        
        System.out.print("Array of Strings: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        // * Bubble Sort
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

    }

}