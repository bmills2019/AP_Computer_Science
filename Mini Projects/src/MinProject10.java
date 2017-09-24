import java.util.Scanner;

public class MinProject10 {
		int Height;
		double MaleWeight;
		double FemaleWeight;

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter a height in inches: ");
		Scanner in=new Scanner(System.in);
		Double Height=in.nextDouble();
	
double MaleWeight=(Height-60)*(7)+(106);
double FemaleWeight=(Height-60)*(6)+(100);
		System.out.println("Recommended Male Weight: "+MaleWeight);
		System.out.println("Recommended Female Weight: "+FemaleWeight);
		
		}
	
}
