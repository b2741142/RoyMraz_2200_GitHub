/*****
 * 
 * @author Roy Mraz
 * Date: 12/07/2022 {W}
 *
 *****/
import java.util.Scanner;
public class Exercise07_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of students: ");
		
		int numberOfStudents = input.nextInt();
		double[] scores = new double[numberOfStudents];
		double best =0;
		
		//read the scores and find out the best
		System.out.print("Enter " + numberOfStudents + " scores: ");
		for( int i =0; i < numberOfStudents; i++) {
			scores[i] = input.nextDouble();
			//check if value read is bigger than the best so far
			if (scores[i] > best) {
				best = scores[i];
			}
		}
		// assert: best is the maximum value of all the scores
		//System.out.print("The best is : "+ best);
		//declare and initialize letter grade string
		char grade;
		
		//assign and display the grades
		
		for(int i = 0; i< numberOfStudents; i++) {
			if(scores[i] >= best -10) grade = 'A';
			else if(scores[i] >= best -20) grade = 'B';
			else if(scores[i] >= best -30) grade = 'C';
			else if(scores[i] >= best -40) grade = 'D';
			else grade = 'F';
			
			System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade );
		}
		
		input.close();
	}

}
