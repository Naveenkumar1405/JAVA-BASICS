import java.util.Scanner;
class Cross 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the Size : ");
		int n = new Scanner(System.in).nextInt();

		for (int i=1;i<=n ;i++ )
		{
			for (int j=1 ;j<=n; j++)
				if (i==j || ((i+j) == n+1)) System.out.print("X");
				else System.out.print(" ");
			System.out.println();
		 }
	  }
  }
