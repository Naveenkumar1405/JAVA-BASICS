class G 
{   int a=10;//non-static variable with initialisation
    int b;//primitive datatype with non-static variable without initialisation
	String str;//non-primitive datatype
	G iam;//non-primitive datatype
	public static void main(String[] args) 
	{   
		G a1;//G is a non-primitive datatype
	    a1=new G();//object creation
		System.out.println(a1.a);
		G a2;//object name a2
		a2=new G();//ANOTHER OBJECT CREATED
		System.out.println(a2.a);
		a2.a=100;
		System.out.println(a2.a);
		G a3;
		a3=new G();
		a3.a=1000;
		System.out.println(a3.a);
        G g1=new G();
        System.out.println(g1.b);//0 BY DEFAULT
		System.out.println(g1.str);//NULL BY DEFAULT FOR non-primitive datatype
		System.out.println(g1.iam);//NULL BY DEFAULT FOR non-primitive datatype
	}
}
