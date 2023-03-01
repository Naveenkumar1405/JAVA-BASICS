class H  
{   int a=1;
    static int b=3;
	public static void main(String[] args) 
	{   int a=9;
	    int b=2;
	    H a1=new H();
		a=(++a)+(++a)+(H.b++)+(a1.a++);
        b=(++a)+(++a)+(H.b++)+(a1.a++);
		
		
		

		System.out.println(a);
		System.out.println(H.b);
		System.out.println(a1.a);
		System.out.println(b);

		
		
		

	    

		
	}
}
