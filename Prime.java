import java.util.Scanner;

class Prime{

  public static void main(String [] args)
  {
   boolean  isPrime=true;
   Scanner p=new Scanner(System.in);
 
 System.out.print("enter number = ");
   int pi=p.nextInt();
   for(int i=2;i*i<=pi;i++)
    {
     if(pi%i==0)
     {
      isPrime=false;
      break;
     }
    }
   if(!isPrime)
{
     System.out.println( pi+ " is not Prime");
}
   else
 {
     System.out.println( pi+ " is  Prime");
} 
   }
}
