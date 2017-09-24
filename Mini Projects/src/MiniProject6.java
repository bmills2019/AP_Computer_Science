
public class MiniProject6 {
//prints a random assortment of stars and lines
	public static void main(String[] args) {
		Top();
		Middle();
		Bottom();
	}
		public static void Top() {
			fiveStars();
			nineStars();
			thirteenStars();
	}
		public static void Middle() {
			System.out.println("");
			fiveStars();
			nineStars();
			thirteenStars();
			twoStarsAndFiveLines();
			thirteenStars();
			fiveStars();
			nineStars();
			thirteenStars();
		}
		public static void Bottom() {
			System.out.println("");
			fiveStars();
			nineStars();
			thirteenStars();
			fiveStars();
			twoStarsAndFiveLines();
			twoStarsAndFiveLines();
			fiveStars();
			fiveStars();
		}
		public static void fiveStars() {
		System.out.println("    *****");
		}
		public static void nineStars() {
		System.out.println("  *********");
		}
		public static void thirteenStars() {
			System.out.println("*************");
		}
		public static void twoStarsAndFiveLines() {
			System.out.println("* | | | | | *");
		}
	
	}
