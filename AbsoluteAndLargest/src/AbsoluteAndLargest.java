/*
 * Brandon Mills
 * Absolute Value and Max Methods
 * Calculates a number's absolute value and the greatest absolute value in a series of three numbers
 */
import java.util.Scanner;//imports scanner
public class AbsoluteAndLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter One Number For Absolute Value: ");
		Scanner in=new Scanner(System.in);//gets user imput
		int absInput=in.nextInt();
		System.out.println("Absolute Value Is: " +absValue(absInput));//prints out absolute value for one number using user input as parameter
		System.out.println("Enter Three Numbers To Find Out The Largest Absolute Value: ");
		int numOne=in.nextInt();
		int numTwo=in.nextInt();//declares variables
		int numThree=in.nextInt();
		System.out.println("The Largest Absolute Value Is: "+findLargest(absValue(numOne),absValue(numTwo),absValue(numThree)));//prints out largest absolute value using user input from previous method as a parameter
	}
	public static int absValue(int x) {//calculates absolute value
		if (x<0) {
			return (x*-1);
		}else{
			return x;
		}
	}

	public static int findLargest(int a,int b,int c) {//finds largest value
		int largestNum = 0;
		if (a > b) {
			if (a > c) {
				largestNum = a;

			}
		} else {
			if (b > a) {
				if (b > c) {
					largestNum = b;
				}
			} else {
				if (c > a) {
					if (c > b) {
						largestNum = c;
					}
				}
			}
		}
		return largestNum;
	}
}
