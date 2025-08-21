package whileloop;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =123;
		int reserve=0;
		
		while(num>0) {
			int digit = num % 10;
			
			reserve =reserve *10+digit;
			
			num=num/10;
	    }//end while
		
		System.out.println(reserve);
	}//end main

}//end class
