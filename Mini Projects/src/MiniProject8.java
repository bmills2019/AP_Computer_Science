import java.util.Scanner;
//this calculates various properties of a sphere using a radius inputed by the user

public class MiniProject8 {
	Double Radius;
	Double Diameter;
	Double Circumference;
	Double SurfaceArea;
	Double Volume;
	static Double Pie=3.14159265358979323846264338327950288419716939937510582;

	public static void main(String[] args) {
		//This prompts the user
		System.out.print("Enter Radius Pls:");
		
		//This gets input from the user
		Scanner in=new Scanner(System.in);
		Double Radius=in.nextDouble();
		
		//This calculates the various properties
		Double Diameter= (Radius*2);
		Double SurfaceArea=(4*Pie)*(Radius*Radius);
		Double Volume=(1.3333*Pie)*(Radius*Radius*Radius);
		Double Circumference=(2*Pie)*(Radius);
		System.out.println("Diameter: " +Diameter);
		System.out.println("Circumference: " +Circumference);
		System.out.println("Surface Area: "+SurfaceArea);
		System.out.println("Volume: "+Volume);
	}
	}
	