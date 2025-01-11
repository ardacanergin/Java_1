import java.util.Scanner;
public class Pro3_150123060 {
//Purpose of this program is the have a simple calculator that makes basic calculations such as: addition, subtraction,
//multiplication and division. Values and operation are decided by user. Some calculations that is mathematically 
//impossible are introduced as an error such as : dividing by zero. Fraction of result exists in 2 digits.
//switch method has been used to solve the problem. Operator must be entered by user as a string, then it will
//be converted to character data type in order to use in "switch" method.
//Arda Can Ergin StudentID:150123060
	public static void main(String[] args) {
		//Taking inputs from user
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the first number for calculation: ");
		double number1 = input.nextDouble();
		System.out.println("What operator are you going to use (+,-,*,/): ");
		String operator = input.next();
		System.out.println("Enter the second number for calculation: ");
		double number2 = input.nextDouble();
		//Compute
		double result;
		switch (operator.charAt(0)) {
		case '+':
			result = number1 + number2;
			System.out.println(number1 + " + " + number2 + " is " + " = " + (int)(result*100)/100.0); //Display will only show first 2 digits of fraction.
			break;
		case '-':
			result = number1 - number2;
			System.out.println(number1 + " - " + number2 + " is " + " = " + (int)(result*100)/100.0);
			break;
		case '*':
			result = number1 * number2;
			System.out.println(number1 + " * " + number2 + " is " + " = " + (int)(result*100)/100.0);//In some cases like using really big numbers fraction is not consist of 2 digits, instead it written in from of scientific notation.
			break;
		case '/':
			result = number1 / number2;
			if (number2==0) {
				System.out.println("Division by " + number2 + " is not possible.");
				// in case of user tries to divide by 0. I used variable number2 instead of just writing 0 since in this way I can also check whether the input for number2 is actually 0.
			}else
			System.out.println(number1 + " / " + number2 + " is " + " = " + (int)(result*100)/100.0);
			break;
		default:
			System.out.println("Error: Please enter a valid operator:+,-,*,/.");
			//default outcome for invalid operator input
		}

	}

}
