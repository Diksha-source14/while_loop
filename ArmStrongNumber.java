package whileloop;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int original =num ;
		double result =0;
		while(num>0) {
			int digit =num % 10;
			//153%10=3
			//15%10=5
			//1%10=0
			
			result = result + Math.pow(digit, 3);
			num =num/10;
			//15/10=1=num
			//1/10=0=num
			System.out.println(result);
		}//end while
		
		System.out.println(num);
		if(original ==result) {
			System.out.println("ArmStrong Number");
		} else {
			System.out.println("Not ArmStrong Number");
		}//end if-else
	}//end main

}//end class
