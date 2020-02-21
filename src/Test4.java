
public class Test4 {
	String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="sai";
modifyString(a);
System.out.println(a);
//
Test4 t=new Test4();
t.name="sai";
modifyObject(t);
System.out.println(t.name);
	}

	private static void modifyObject(Test4 t) {
		// TODO Auto-generated method stub
		t.name="nikhil";
		
	}

	private static void modifyString(String a) {
		// TODO Auto-generated method stub
		a="Nikhil";
	}

}
