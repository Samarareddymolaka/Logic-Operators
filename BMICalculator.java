package practiceJava.LogicOperators;



	import java.util.Scanner;

	public class BMICalculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter your weight (in kilograms): ");
	        double weight = scanner.nextDouble();

	        System.out.print("Enter your height (in meters): ");
	        double height = scanner.nextDouble();

	        double bodyMassIndex = calculateBMI(weight, height);
	        System.out.println("Your Body Mass Index (BMI) is: " + bodyMassIndex);

	        if (bodyMassIndex < 18.5) {
	            System.out.println("Your BMI suggests that you are underweight. You might want to gain some weight.");
	        } else if (bodyMassIndex < 25) {
	            System.out.println("Your BMI suggests that your weight is normal. Good job!");
	        } else if (bodyMassIndex < 30) {
	            System.out.println("Your BMI suggests that you are overweight. Consider working on your weight.");
	        } else {
	            System.out.println("Your BMI suggests that you are obese. It might be beneficial to focus on weight management.");
	        }

	        scanner.close();
	    }

	    private static double calculateBMI(double weight, double height) {
	        return weight / (height * height);
	    }
	}
