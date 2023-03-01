import java.util.Scanner; //* IS USED TO IMPORT ALL THE CLASS FILES INSIDE JAVA.UTIL PACKAGE
class I 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner (System.in); //CREATING A OBJECT TO GET USER INPUTS
		System.out.println("ENTER NUMBER HERE");
		int a=s.nextInt();					 //ASSIGNING A METHOD PROPOTIONAL TO THE VALUE TO BE RECEIVED
        Scanner q=new Scanner (System.in);
		System.out.println("ENTER ANOTHER NUMBER HERE");
		int b=q.nextInt();						 //ASSIGNING A METHOD PROPOTIONAL TO THE VALUE TO BE RECEIVED
		System.out.println("a value is "+a);
		System.out.println("b value is "+b);
		System.out.println("SUM OF TWO NUMBERS IS "+"\t"+(a+b));
		System.out.println("SUB OF TWO NUMBERS IS "+"\t"+(a-b));
		System.out.println("MULTI OF TWO NUMBERS IS"+"\t"+(a*b));
		System.out.println("MOD OF TWO NUMBERS IS "+"\t"+(a%b));
		System.out.println("DIV OF TWO NUMBERS IS "+"\t"+(a/b));
	}
}
