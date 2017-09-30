//Math Class Practice
//Brandon Mills
//Calculates the largest number 

import java.util.Scanner;
public class MathClassPractice {
		
	public static void main(String[] args) {
		int numOne;
		int numTwo;
		int numThree;
		int partialMax;
		System.out.println("Enter the first number: ");
		Scanner scanNum1=new Scanner(System.in);
		int numOne=in.nextInt();
		System.out.println("Enter the first number: ");  //prompts user for number input
		Scanner scanNum2=new Scanner(System.in);
		int numTwo=in.nextInt();
		System.out.println("Enter the first number: ");
		Scanner scanNum3=new Scanner(System.in);
		int numThree=in.nextInt();
		in.close();
		System.out.println(biggestNumberCalc(numOne, numTwo, numThree));//prints biggest number 
		}
 public static int biggestNumberCalc(int x, int y, int z) {
	 int partialmax=Math.max(x, y);//calculates biggest number
	 return Math.max(partialmax,z);
	 
	 
 }
}
