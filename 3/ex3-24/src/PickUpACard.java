/**
 * 
 */

/**
 * @author Wei
 *
 */
public class PickUpACard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int card = (int)(Math.random() * 14);
		int face = (int)(Math.random() * 5);
		
		switch (card) {
			case 1:
				System.out.println("The card you picked is Ace of");
				break;
			case 2:
				System.out.println("The card you picked is 2 of");
				break;
			case 3:
				System.out.println("The card you picked is 3 of");
				break;
			case 4:
				System.out.println("The card you picked is Ac4e of");
				break;
			case 5:
				System.out.println("The card you picked is 5 of");
				break;
			case 6:
				System.out.println("The card you picked is 6 of");
				break;
			case 7:
				System.out.println("The card you picked is 7 of");
				break;
			case 8:
				System.out.println("The card you picked is 8 of");
				break;
			case 9:
				System.out.println("The card you picked is 9 of");
				break;
			case 10:
				System.out.println("The card you picked is 10 of");
				break;
			case 11:
				System.out.println("The card you picked is Jack of");
				break;
			case 12:
				System.out.println("The card you picked is Queen of");
				break;
			case 13:
				System.out.println("The card you picked is King of");
				break;
			default:
				break;
		}
		
		switch (face) {
			case 1:
				System.out.println("Clubs");
				break;
			case 2:
				System.out.println("Diamonds");
				break;
			case 3:
				System.out.println("Hearts");
				break;
			case 4:
				System.out.println("Spades");
				break;
		}
	}

}
