
public class Screenshot18 {
	static {
		System.out.println("from static");
	}
	public static void m1() {
		synchronized(Screenshot18.class){
			System.out.println("from synchronised");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		synchronized(Screenshot18.class){
			System.out.println("from synchronised");
		}
System.out.println("from main");

synchronized(Screenshot18.class){
	System.out.println("from synchronised");
}
	}

}
