package whileLoop;

public class Palindrome {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int num =123;
			int original =num;
			int reserveNum=0;
			
			while(num!=0) {
				int digit = num % 10;
				
				reserveNum=reserveNum*10+digit;
				
				num=num/10;
		    }//end while
			
			if(original == reserveNum) {
				System.out.println("palindrome");
			}else {
				System.out.println("Not palindrome");
			}//end if-else
			
		}//end main

	}//end class



