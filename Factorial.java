public class Factorial {

   public static void main(String []args)
 {
 
  int num,i;
  int num1=1;
 
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter the number=");
  
     num=sc.nextInt();
 
      for(i=1;i<=num;i++)
  
     num1*=i;
    
   System.out.print("The factorial of given number is="+num1);
  
 }

} 
