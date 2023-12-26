public class HelloNumbers {
	public static void Print() {
		System.out.println("Hello World!");
	}
	public static void main(String[] args) {
		Print();

		int x = 0;
		int cumulativeSum = 0;
		while ( x < 10 ) {
			cumulativeSum = cumulativeSum + x;
			System.out.print( cumulativeSum + " " );
			x = x + 1;
		}
	}
}
