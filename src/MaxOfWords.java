
public class MaxOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(solution("we test coders.Give us a try"));
		//System.out.println(solution("forget cvs...save time.x x"));
		//We test Coders. Give us a try?
		System.out.println(solution("We test Coders"));
	}

	public static int solution(String A) {

		String[] sentences = A.trim().split("\\.");
		int max = 0;

		for (String s : sentences) {
			int temp = s.trim().split(" ").length;
			if (max < temp) {
				max = temp;
			}
		}

		return max;

	}
}
