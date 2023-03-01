class B 
{
	public static void main(String[] args) 
	{
		System.out.println("1");
		m1();//METHOD CALLING
		System.out.println("6");
	}
    public static void m1()
	{
		System.out.println("2");
		m2();//METHOD CALLING
		System.out.println("5");
	}
	 public static void m2()
	{
		System.out.println("3");
		System.out.println("4");
	}
}
