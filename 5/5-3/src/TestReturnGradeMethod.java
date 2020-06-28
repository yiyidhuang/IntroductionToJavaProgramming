/**
 * 
 */

/**
 * @author Wei
 *
 */
public class TestReturnGradeMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("The grade is " + getGrade(78.5));
		System.out.print("\nThe grade is " + getGrade(59.5));
	}
	
	public static char getGrade(double score) {
		if (score >= 90.0)
			return 'A';
		else if (score >= 80.0)
			return 'B';
		else if (score >= 70.0)
			return 'C';
		else if (score >= 69.0)
			return 'D';
		else 
			return 'F';
	}

}
