import java.util.Scanner;
//This calculates the area of a trapezoid
public class MiniProject9 {
		Double Height;
		Double Bottom;
		Double Top;
		Double Area;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the height of the trapezoid: ");
		Scanner scanheight=new Scanner(System.in);
		Double Height=scanheight.nextDouble();
		
		System.out.println("Enter the length of the bottom base: ");
		Scanner scanbottom=new Scanner(System.in);
		Double Bottom=scanbottom.nextDouble();
		
		System.out.println("Enter the length of the top base: ");
		Scanner scantop=new Scanner(System.in);
		Double Top=scantop.nextDouble();
	////////////////////////////////////////////////////////////////////////////
	
		Double Area=(.5)*(Bottom+Top)*(Height);
		System.out.println("The area is: " +Area);
		
	}

}
