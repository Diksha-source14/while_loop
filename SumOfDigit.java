package whileloop;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =156;
		int reserve=0;
		
		while(num>0) {
			int digit = num % 10;
			
			reserve =reserve +digit;
			
			num=num/10;
		}
		
		System.out.println(reserve);
	}//end main

}//end class
