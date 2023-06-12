package Inheritance2;

public class Test {
	
	int a,b;
	Test(){
		//LI
	}
	Test(int a,int b){
		this.a=a;
		this.b=b;
	}
	
}
class Test1 extends Test{
	
	int c,d;
	
	Test1(){
		//super();
		//LI
	}
	Test1(int c,int d,int a,int b){
		super(a,b);
		
		this.c=c;
		this.d=d;
	}
	
}
class Test2 extends Test1{
	int e,f;
	
	Test2(){
		//super();
		//LI
	}
	Test2(int a,int b,int c,int d,int e,int f){
		super(a,b,c,d);
		this.e=e;
		this.f=f;
	}
	
	public void detailsoftest() {
		System.out.println("The value of a is: "+a);
		System.out.println("The value of b is: "+b);
		System.out.println("The value of c is: "+c);
		System.out.println("The value of d is: "+d);
		System.out.println("The value of e is: "+e);
		System.out.println("The value of f is: "+f);
	}
}
