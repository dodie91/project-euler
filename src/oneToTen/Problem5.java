package oneToTen;

public class Problem5 {

	public static void main(String[] args) {
		int startNum = 380;
		boolean test = false;
		
		while(test != true){
			for(int i = 3; i<=19; i++){
				if(startNum % i != 0){
					i=3;
					startNum+=20;
				}
				else if(i==19 && startNum%i==0){
					test = true;
					System.out.println("Result: " + startNum);
					break;
				}
			}
		}
		System.out.println(startNum);

	}

}
