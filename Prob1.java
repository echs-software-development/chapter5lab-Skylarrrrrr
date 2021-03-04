import java.util.Scanner;  
public class Prob1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.print("How many grades would you like to enter: ");
		
		int times = scan.nextInt();
		int sumOfGrades = 0; //outside the loop so condition does not get set to 0
		//every time the loop iterates
		
		for (int i = 1; i <= times;i++) {
			
			System.out.println("Enter grade " + i + "-->");
			int grade = scan.nextInt();//inside the loop- eval to this grade only
			//sumOfGrades = sumOfGrades + grade;
			sumOfGrades += grade;
			
		}
		
		System.out.println("The sum of the grades is:: " + sumOfGrades);
			
			
		}
		
		

	}