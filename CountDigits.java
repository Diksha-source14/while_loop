package whileLoop;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the test cases you want to run: ");
		int n = sc.nextInt();
		
		while (n > 0) {
			System.out.println("Enter the Number: ");
			int num = sc.nextInt();
			
			int counter = 0;
			while(num > 0) {//123
				int digit = num%10;
				
				counter++;//3
				num = num/10;//1/10=0
			}//end while
			
			System.out.println(counter);
			n--;
		}//end while
	}//end main

}//end class
