package oneToTen;

public class Problem2 {

	public static void main(String[] args) {
		
		long num1 = 1;
		long num2 = 2;
		long total = 0;
		long overall = 2;
		
		while(total<=4000000L){
			
		total = num1 + num2;
		num1 = num2;
		num2 = total;
		if(total %2 ==0){
			overall+=total;
		}
		}
		
		System.out.println(overall);
		
		
	}

}
