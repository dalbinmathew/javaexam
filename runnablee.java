import java.util.*;
class fibonacci implements Runnable{
int limit;
fibonacci(int n){
limit=n;
}
public void run(){
int a = 0, b = 1, c;
System.out.println(a);
System.out.println(b);
for (int i = 2; i < limit; i++){
c = a + b;
a = b;
b = c;
System.out.println(c);
}
}
}
class Even implements Runnable{
int start,end;
Even(int st,int en){
start=st;
end=en;
}
public void run(){
for (int i = start; i <= end; i++){
if (i % 2 == 0){
System.out.println("Even: "+i);
}
}
}
}
public class runnablee
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of Fibonacci numbers: ");
int n = sc.nextInt();
System.out.print("Enter the start and end range for even numbers: ");
int st = sc.nextInt();
int en = sc.nextInt();
fibonacci f = new fibonacci(n);
Even e = new Even(st,en);
Thread fi=new Thread(f);
Thread ev=new Thread(e);
fi.start();
ev.start();
}
}