//Math Class Practice
//Brandon Mills
//Calculates the largest number 

import java.util.Scanner;
public class MathClassPractice {
		
	public static void main(String[] args) {
		int numOne,numTwo,numThree,partialMax;
		
		System.out.print("Enter the first number: ");
		Scanner in=new Scanner(System.in);
		numOne=in.nextInt();
		System.out.print("Enter the second number: ");  //prompts user for number input
		numTwo=in.nextInt();
		System.out.print("Enter the third number: ");
		numThree=in.nextInt();
		in.close();
		System.out.println("The biggest number is: " +biggestNumberCalc(numOne, numTwo, numThree));//prints biggest number 
		}
 public static int biggestNumberCalc(int x, int y, int z) {
	 int partialmax=Math.max(x, y);//calculates biggest number
	 return Math.max(partialmax,z);
	 
	 
 }
}
