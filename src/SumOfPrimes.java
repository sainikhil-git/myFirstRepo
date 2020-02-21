
public class SumOfPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumPrime(10));
	}

	public static int sumPrime(int number) {
		int count = 0;
		int sum = 0;
		int number2 = 2;
		while (count < number) {
			if (isPrimeNumber(number2)) {
				System.out.println(number2);
				sum += number2;
				count++;
			}
			number2++;
		}
		return sum;
	}

	private static boolean isPrimeNumber(int number) {
		// TODO Auto-generated method stub
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}


