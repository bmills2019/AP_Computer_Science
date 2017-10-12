/*
 * Brandon Mills
 * Unique Digits
 * Decides whether or not a number is unique
 */
import java.util.Scanner;//imports Scanner
public class uniqueDigits {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);//gets user input
		System.out.println("Enter A Number: ");
		int specialNum=in.nextInt();
		System.out.println(specialCalc(specialNum));//prints out method using user input as parameter

	}
	public static String specialCalc(int x) {
		int digitOne=0,digitTwo=0,digitThree=0;
		String uniqueness = null;
		digitOne=x/100;			//isolates each digit of number and puts it into a variable
		digitTwo=(x-(digitOne*100))/10;
		digitThree=(x-digitOne*100)-(digitTwo*10);

		if (digitOne!=digitTwo) {
			if (digitOne!=digitThree) {//decides whether or not each digit is equal to the another digit
				uniqueness="Unique";
			}
		}else {
			uniqueness="Not Unique";
		}
		return uniqueness;
	}
}
