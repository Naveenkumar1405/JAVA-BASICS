import java.util.Scanner;
class HappyNumber
{
    public static void main(String[] args)
    {
		System.out.print("Enter number : ");
        int n = new Scanner(System.in).nextInt();

		int  r = 1, num, sum = 0;
        num = n;
        while (num > 9)
        {
            while (num > 0)
            {
                r = num % 10;
                sum+=(r * r);
                num/=10;
            }
            num = sum;
            sum = 0;
        }
        if (num == 1)
            System.out.println("Happy Number !!!");
        else
            System.out.println("Not Happy Number");
        }
    }
