import java.util.Scanner;

/**
 * 
 */

/**
 * @author Wei
 *
 */
public class CalculateCylinderVolume {

	final static double PI = 3.1415926;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Read the radiu and height
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please input the radius: ");
		double radius = input.nextDouble();
	
		double height = input.nextDouble();
		
		double area = radius * radius * PI;
		double volume = area * height;
		
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
	}

}
