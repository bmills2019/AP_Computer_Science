/*
 * Mini Project 4
 * Brandon Mills
 * This prints a rocket saying hello world
 */
public class MiniProject4 {

	public static void main(String[] args) {
		topAndBottom();
		minusAndPlusLine();
		sideOfRocket();
		minusAndPlusLine();
		sideOfRocketWithHelloWorld();
		minusAndPlusLine();
		sideOfRocket();
		minusAndPlusLine();
		topAndBottom();
	}
 public static void topAndBottom() {
	 System.out.println("    /\\      ");
	System.out.println("   /  \\     ");
	System.out.println("  /    \\    ");
}
public static void minusAndPlusLine () {
	System.out.println(" +------+");
}

public static void sideOfRocket() {
	System.out.println(" |      |");
	System.out.println(" |      |");
	}
public static void sideOfRocketWithHelloWorld() {
	System.out.println(" |Hello |");
	System.out.println(" | World|");
}



}