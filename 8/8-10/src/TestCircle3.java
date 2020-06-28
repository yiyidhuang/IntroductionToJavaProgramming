
public class TestCircle3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Circle with radius 5.0
		Circle3 myCircle = new Circle3(5.0);
		System.out.println("The area of the circle of radius "
				+ myCircle.getRadius() + " is " + myCircle.getArea());
		
		// Increase myCircle's radius by 10%
		myCircle.setRadius(myCircle.getRadius() * 1.1);
		
		System.out.println("The area of the circle of radius "
				+ myCircle.getRadius() + " is " + myCircle.getArea());
		
		System.out.println("The number of objects created is "
				+ Circle3.getNumberOfObjects());
	}

}
