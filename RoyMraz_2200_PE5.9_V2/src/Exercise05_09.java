/******
 * 
 * @author Roy Mraz
 * Date: 10/31/2022 [M]
 *
 ******/
import java.util.Scanner;
public class Exercise05_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		//prompt the user for the number of students
		//assume that there is at least two students
		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		
		//make sure that score1 >= score2
		String student1 = "";
		double score1 = Double.MIN_VALUE;
		
		
		String student2 = "";
		double score2 = Double.MIN_VALUE;
		
		
		
		// Assert: score 1> score2
		for( int i=0; i<(numberOfStudents); i++) {
			System.out.println("Enter a student name: ");
			String student = input.next();
			
			System.out.println("Enter a student score: ");
			double score = input.nextDouble();
			
			if (score > score1) {
				student2 = student1;
				score2 = score1;
				student1 = student;
				score1 = score;
			}
			else if (score > score2) {
				student2 = student;
				score2 = score;
			}
		}
		System.out.println("Top two students:");
		System.out.println(student1 +"'s score is " + score1);
		System.out.println(student2+ "'s score is " + score2);
		input.close();

	}

}