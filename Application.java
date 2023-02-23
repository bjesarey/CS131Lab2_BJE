/**
 * Tests the Wizard Class and Lockable interface.
 */

/**
 * @author brandonesarey
 * @version 1.3
 * Lab 2.1
 * Semester Year Spring 2023
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wizard strange = new Wizard();
		System.out.println(strange.toString());
		strange.takeDamage(60);
		strange.setKey(7);
		strange.lock(11);
		strange.lock(7);
		strange.takeDamage(60);
		strange.unlock(4);
		strange.unlock(7);
		strange.takeDamage(40);
		strange.takeDamage(400);
	}//end main()

}//end Application
