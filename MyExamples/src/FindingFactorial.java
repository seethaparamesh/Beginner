import java.util.Scanner;

public class FindingFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility util = new Utility();
		System.out.println("Enter a number to find its factorial:");
		Scanner fact = new Scanner(System.in);// constructor to accept user
												// input
		int fact1 = fact.nextInt();
		int result = util.factorial(fact1);
		System.out.println("The factorial is:" + result);
	}

}
