package oneToTen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Problem4 {

	public static void main(String[] args) {

		int multiple;
		int highestPalindrome = 0;
		boolean result;

		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				multiple = i * j;
				result = test(multiple);
				if (result == true && multiple > highestPalindrome) {
					highestPalindrome = multiple;
				}

			}

			System.out.println(highestPalindrome);
		}

	}

	public static boolean test(int num) {
		List<Integer> numberList = new ArrayList<>();
		int length;
		int halfway;
		int testNum1;
		int testNum2;
		boolean result = true;

		while (num > 0) {
			numberList.add(num % 10);
			num = num / 10;
		}

		length = numberList.size();
		halfway = length / 2;

		for (int i = 0; i < halfway; i++) {
			testNum1 = numberList.get(i);
			testNum2 = numberList.get(length - 1);
			if (testNum1 != testNum2)
				result = false;
			length--;
		}

		return result;
	}

}
