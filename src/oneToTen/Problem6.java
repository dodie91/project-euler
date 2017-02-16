package oneToTen;

public class Problem6 {

	public static void main(String[] args) {
		
		int sumOfTheSquares = 0;
		int sunOfTheSquaresTemp = 0;
		int squareOfTheSums = 0;
		int answer;
		
		for(int i=0; i<=100; i++){
			sumOfTheSquares+=(i*i);
			squareOfTheSums+=i;
		}
		squareOfTheSums = squareOfTheSums*squareOfTheSums;
		answer = squareOfTheSums-sumOfTheSquares;
		System.out.println("Answer: " + answer);

	}

}
