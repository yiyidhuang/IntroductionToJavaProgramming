
public class TestCircleWithExeception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			CircleWithException c1 = new CircleWithException(5);
			CircleWithException c2 = new CircleWithException(-5);
			CircleWithException c3 = new CircleWithException(0);
		} catch (IllegalArgumentException ex) {
			System.out.println(ex);
		}
		
		System.out.println("Number of objects created: " +
						CircleWithException.getNumberOfObjects());
	}

}
