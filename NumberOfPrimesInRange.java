import java.util.Scanner;

public class NumberOfPrimesInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int l = sc.nextInt();
		System.out.println("Enter the Second Number");
		int r = sc.nextInt();
		sc.close();
		System.out.println(numberOfPrimeInRange(l,r));

	}
	static boolean isPrime(int n) {
		if(n<=1) return false;
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		} return true;
	}
	static int numberOfPrimeInRange(int l, int r) {
		int count = 0;
		for(int n = l; n <= r; n++) {
			if(isPrime(n)) {
				count++;
			}
		}
		return count;
	}

}
