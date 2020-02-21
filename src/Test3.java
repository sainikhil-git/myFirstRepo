class A{
	static void m() {
		System.out.println("hi");
	}
}
class B extends A{
	static void m() {
		System.out.println("hello");
	}
}
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new B();
		a.m();
		
		B b=new B();
		b.m();

	}

}
