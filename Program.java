package testpractice;

public class Program {
	static int a=5;
	static int b=15;
	static Object d=10.0;
    static Double d1=10.0;
public static void main(String[] args) {
	System.out.println(++a>b && ++b<a);
	System.out.println(d.equals(d1));
	System.out.println(d1==d);
	System.out.println(d.hashCode());
	System.out.println(d1.hashCode());
	System.out.println(a);
	System.out.println(b);
//	A a=new B();
//	a.method();
//	a.display();
//	Double.isNaN()
	for(int x=0;x<1;x++)System.out.println(x);
	int x=1;
	System.out.println(x++);
	System.out.println(x);
	int i=10;
	double i1=10.0;
	//System.out.println(i1.equals(i));
	System.out.println(i1==i);
	Object o=10;
	StringBuilder sb=new StringBuilder(10);
	String s=new String("10");
	//System.out.println(o.equals(o1));
	System.out.println(s.equals(sb));
	
}
}
