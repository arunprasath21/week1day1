package week1.Day1.assisgnment;

public class FibonacciSeries {
	public static void main(String[] args) {
		
		int firstNum = 0;
		int secondNum = 1;
		int thirdNum;
	
		
		for(int i=0;i<8;i++) {
		
	    System.out.println(firstNum);
		thirdNum = firstNum + secondNum;
		
		firstNum = secondNum;
		secondNum = thirdNum;
		

		}	
	}

}
