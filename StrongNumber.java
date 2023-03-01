import java.util.Scanner;
class StrongNumber
{
public static void main(String[] args) 
{
int n, i, fact_n, lastdig, total = 0;

Scanner s = new Scanner(System.in);
System.out.print("Enter the number : " );
n = s.nextInt();
int num = n;
while(n != 0)
{
lastdig = n % 10;
System.out.println(lastdig+"!");

i = 1;
fact_n = 1;

while(i <= lastdig)
{fact_n*=i;
i++;}
total+=fact_n;
n /=10;
}

if(total == num)
System.out.println(num + " is a strong number");
else
System.out.println(num + " is not a strong number");
}
}
