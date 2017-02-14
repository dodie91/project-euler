package oneToTen;

public class Problem3 {

	public static void main(String[] args) {

		long i;
		long number = 600851475143L;
	    for (i = 2L; i <= number; i++) {
	        if (number % i == 0) {
	            number /= i;
	            i--;
	        }
	    }
	    System.out.println(i);
	}
}
