import java.util.Scanner;

public class Prob3 {
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

      System.out.println("Enter the number of students: ");
    int numOfStudents = scan.nextInt();

    System.out.println("Enter a student name: ");
    String student1 = scan.nextLine();
    System.out.println(
      "Enter a student score: ");
    double score1 = scan.nextDouble();

    for (int i = 0; i < numOfStudents - 1; i++) {
      System.out.println(
      "Enter a student name: ");
      String student = scan.nextLine();

      System.out.println(
        "Enter a student score: ");
      double score = scan.nextDouble();

      if (score > score1) {
        student1 = student;
        score1 = score;
      }
    }

    System.out.println("Top student" + student1 + "'s score is " + score1);
  }
}