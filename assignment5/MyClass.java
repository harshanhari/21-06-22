package assignment5;

public class MyClass implements A{

	public static void main(String[] args) {
MyClass c=new MyClass();
c.meth1();
c.meth2();
	}

	@Override
	public void meth1() {
System.out.println("This is method 1");		
	}

	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		System.out.println("This is method 2");
	}

}
