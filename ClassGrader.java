package practiceJava.LogicOperators;

	import java.util.Scanner;

	/*
	 * Part 1: Class Grader
	Open IntelliJ Idea App and create a project called ClassGrader
	Write a program where a user enters the grade of a student and the program returns a grade based on the following conditions
	Failed if they scored 3 or less
	Insufficient if they scored > 3 but less than 5. (5 included)
	Good if they scored > 5 but less than 8. (8 included)
	Excellent Grade if they scored 10.
	if participants enter a negative number or a number outside the range supported (outside 0 - 10)
	 */

	public class ClassGrader {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the student's grade: ");
	    int grade = sc.nextInt();
	    if (grade >= 0 && grade <= 10) {
	        if (grade <= 3) {
	            System.out.println("Grade: Failed");
	        } else if (grade <= 5) {
	            System.out.println("Grade: Insufficient");
	        } else if (grade <= 8) {
	            System.out.println("Grade: Good");
	        } else {
	            System.out.println("Grade: Excellent Grade");
	        }
	    } else {
	        System.out.println("Invalid grade! Grade should be between 0 and 10.");
	    }

	    sc.close();
	}

	    
	}
		

