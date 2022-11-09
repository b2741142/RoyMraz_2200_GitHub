/*****
 * 
 * @author Roy Mraz
 * Date: 11/09/20222 [W]
 *
 *****/
import java.util.Scanner;
public class Exercise06_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		
		System.out.println("Enter a character: ");
		char c = input.nextLine().charAt(0);
		
		int count = count(s,c);
		System.out.println("The number of occurrences of " + c +" is " + count);
		
		input.close();
		

	}
	public static int count(String str, char ch) {
		int count = 0;
		for( int i = 0; i < str.length(); i++) {
			if( str.charAt(i) == ch ) {
				count ++;
			}
		}
		return count;
	}

}
