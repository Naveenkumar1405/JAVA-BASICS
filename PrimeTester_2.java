import java.util.Scanner;
class PrimeTester_2 
{  
	public static void main(String[] args) 
{
	Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Num1");
    int num1 = scanner.nextInt();
    System.out.println("Enter Num2");
	int num2 = scanner.nextInt();
		if (num1 >= num2)
	{
    System.out.println("Num2 must be greater then Num1");
    System.exit(0);
    }
    while (num1 <= num2) 
	{
      int i = 2, count = 0;
      while (i <= num1 / 2) 
		  {
			 if (num1 % i == 0) 
				{
                    count++;
                    break;
                }
                i++;
           }
            if (count == 0) 
			{
                System.out.println(num1 + " is prime number");
            }
            num1++;
		}
	}
}
	
