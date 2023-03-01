import java.util.Scanner;
class SumOf1st3AfterReversing  
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a Number : ");
		long n=new Scanner(System.in).nextLong();	
		
		long num=0,sum=0,rev=0,digit=0;

		for(;n>0;n/=10)       rev=rev*10+(n%10);
		System.out.println("Reverse of the number is : "+ rev);

		rev/=100;

		while(rev > 0)  
        {     
         digit = rev% 10;  
         sum+=digit;  
         rev/=10;  
         }
		System.out.println("Sum of the 1st Three digits of number after Reversing is : "+ sum);
	}
}
