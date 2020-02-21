
public class Test5 {
	int x;
	int y;

	void cal(int a, int b) {
		x = a + 1;
		y = b;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test5 t = new Test5();
		t.cal(2, 3);
		System.out.println(t.x + "  " + t.y);
	}

}
