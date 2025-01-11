import java.util.Scanner;
public class Pro2_150123060 {
//The purpose of this program is to calculate the formula of the perpendicular bisector of a line segment between two
//points. Two points that creating the line segment are taken by the user as x1, y1 and x2,y2. Based on these two points
//perpendicular bisector of the line will be calculated and displayed.
// Arda Can Ergin StudentID:150123060
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first point (X1 and Y1) to create a line: "); //taking inputs of first point from user
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();

		System.out.print("Enter the second point (X2 and Y2) to create a line: "); //inputs of second point
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		//Compute
		double slope = (y2-y1) / (x2 - x1);
		double xmidpoint = (x1 + x2)/2;
		double ymidpoint = (y1 + y2) / 2;
		double newslope = Math.pow(-1*slope,-1 );
		double yinter = ymidpoint- newslope*xmidpoint; //introducing new variable for more readable code
		//Display
		System.out.println("Perpendicular bisector formula of a line that goes from " + x1 + "," + y1 + " to " + x2 + "," + y2 + " is: y=" + newslope + "x + " + yinter);

	}

}
