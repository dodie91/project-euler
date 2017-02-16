package oneToTen;

public class Problem7 {

	public static void main(String[] args) {

		int count = 1;
		int testNum = 2;
		int prime = 0;
		boolean confirm = true;

		while (count <= 10001) {

			for (int i = 2; i <= testNum; i++) {
				if (testNum % i == 0 && testNum != i) {
					confirm = false;
				} else if (testNum % i == 0 && testNum == i && confirm == true) {
					prime = testNum;
					count++;
				}
			}
			testNum++;
			confirm = true;
		}
		System.out.println(prime);

	}

}
