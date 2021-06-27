import java.util.Scanner;
class Fib{

 public static void main(String [] args)
 {
  int a=0 ,b=1,c; 
  Scanner input=new Scanner(System.in);
  System.out.print("Enter number of terms = ");
  int n=input.nextInt();
  System.out.print(a + " " +b);
  for(int i=1;i<n-1;i++)
   {
    c=a+b;
    System.out.print(" " +c);
    a=b;
    b=c;
   }
  }
}
