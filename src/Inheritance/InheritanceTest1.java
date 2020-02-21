package Inheritance;

class A{
	static int i=0;
	static void modifyi() {
		i=1;
		System.out.println(i);
	}
}


public class InheritanceTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A.modifyi();
		A a=new A();
		a.i=5;
		A.modifyi();
		
		String s="snik";
				s=s.replace("i", "I");
				System.out.println(s);
	}

}
