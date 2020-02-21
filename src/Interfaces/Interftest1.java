package Interfaces;

interface Interftest1 {
	static int i = 0;
	public static String name = "snik";
	//int k;

	default void printsmnthng() {
		//int i=6;
		System.out.println(i+2);
	}

	static  void m2() {

	}

	public default void Interftest1() {
		System.out.println("hello");
	}

}
class A implements Interftest1 {
	public static void main(String[] args) {
		   //System.out.println(Interftest1.i+4);
		   A a=new A();
		a.printsmnthng();
	}

	
}
