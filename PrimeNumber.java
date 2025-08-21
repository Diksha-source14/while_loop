package whileloop;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =51;
		
		int i=2;
		boolean flag =true;
		
		while(i<num) {
			if (num%i == 0) {
				flag = false ;
				
			}//end if
			
			i++;
		}//end while
		
		if(flag) {
			System.out.print("Prime");
		} else {
			System.out.print("Not Prime");
		}//end if-else
	}//end main

}//end class
