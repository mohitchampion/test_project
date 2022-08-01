package PRACTICE;

public class TestVeriable {
	int a=5,b=3,c=4;
	static int d=5,e=6;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	TestVeriable ob=new TestVeriable();
	System.out.println(ob.a+ob.b+ob.c+d+e);
	ob.a=ob.b+d;
	ob.b=ob.c+e;
	d=ob.a+ob.b;
	System.out.println(ob.a+ob.b+ob.c+d+e);
	TestVeriable ob1=new TestVeriable();
	ob1.a=ob.a+ob1.b;
	ob1.b=ob1.a+ob1.c;
	e=ob1.a+ob1.b;
	System.out.println(ob1.a+ob1.b+ob1.c+d+e);
	TestVeriable ob2=new TestVeriable();
	System.out.println(ob2.a+ob2.b+ob2.c+d+e);
	

	}

}
