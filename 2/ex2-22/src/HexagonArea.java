import java.util.Scanner;

public class HexagonArea {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		
		double area = ((3 * Math.pow(3, 0.5)) * Math.pow(side, 2)) / 2;
		
		System.out.println("The area f the hexagon is " + area);
	}
}
