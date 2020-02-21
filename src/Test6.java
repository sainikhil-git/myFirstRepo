import java.util.HashSet;

public class Test6 {
	int a;

	@Override
	public String toString() {
		return "Test6 [a=" + a + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		String s1=new String("hello");
		String s2=new String("hello");
		
		
		Test6 t1=new Test6();
		t1.a=1;
		
		Test6 t2=new Test6();
		t2.a=1;
		
		hs.add(s2);
		hs.add(s1);
		hs.add(t1);
		hs.add(t2);
		
		System.out.println(hs);
		//System.out.println(s1.equals(s2));
	}

}
