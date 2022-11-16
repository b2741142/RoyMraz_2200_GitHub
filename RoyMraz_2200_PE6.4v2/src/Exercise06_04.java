/*****
 * 
 * @author Roy Mraz
 * Date: 11/14/2022 [M]
 *
 *****/
import java.util.Scanner;
public class Exercise06_04 {
	public static void main(String[] args) {
		System.out.print("Enter an integer: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		reverse(number);
		input.close();
	}
	public static void reverse(int n) {
		if( n == 0) {
			System.out.println(n);
		}
		while( n != 0) {
			//int remainder = n % 10;
			
			/*String num = Integer.toString(n);
			int length = num.length();
			int numb = num.charAt(0);
			*/
			
			if ( n < 0 ) {
				System.out.print(n % 10);
				n = n * -1;
				n = n /10;
			}
			else {
				System.out.print(Math.abs(n % 10));
				n = n / 10;
			}
			/*else {
				System.out.print( n % 10);
				n = n / 10;
			}
			*/
			
			
			
			
		}
		
	}

}
