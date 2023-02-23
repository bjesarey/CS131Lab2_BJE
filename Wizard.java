/**
 * This class represents a wizard for a D&D type game.
 * 
 * @author rkelley, but modified by Brandon Esarey
 * @version 1.0 Lab 2 CS131ON
 * Lab 2.1
 * Semester year Spring 2023
 *
 */
public class Wizard implements Lockable {

	private String name;
	private int health;
	private int key;
	boolean locked;

	/**
	 * End constructor to put object into consistent state
	 */
	public Wizard() {
		setName("Stephen");
		setHealth(500);
		setKey(0);
		setLocked(false);
	}// end constructor

	/**
	 * Constructor to create object with common usage. This is the preferred
	 * constructor.
	 * 
	 * @param name
	 */
	public Wizard(String name) {
		this.name = name;
	}// end constructor

	/**
	 * This method processes the damage to the object when it is hit by other
	 * objects (e.g. weapons, lightning, etc.)
	 * 
	 * @param power
	 */
	public void takeDamage(int power) {
		System.out.println("\nThe skeleton attacks!");
		if (isLocked() == true) {
			System.out.println(name + " is invincible and took no damage!");
		} // end if

		else {
			health = health - power;
			System.out.println(name + " has been wounded! " + name + "'s health is now " + health + ".");
		} // end else

		if (health <= 0) {
			System.out.println(name + " has died. Game over.");
		} // end if #2
		
	}// end takeDamage

	/**
	 * Getter for name
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}// end getName

	/**
	 * Setter for name
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}// end setName

	/**
	 * Getter for health
	 * 
	 * @return
	 */
	public int getHealth() {
		return health;
	}// end getHealth

	/**
	 * Setter for health
	 * 
	 * @param health
	 */
	public void setHealth(int health) {
		this.health = health;
	}// end setHealth

	/**
	 * Getter for the key
	 * 
	 * @return
	 */
	public int getKey() {
		return key;
	}// end getKey

	/**
	 * @param locked the locked to set
	 */
	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	@Override
	public String toString() {
		return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
	}// end toString

	@Override
	public void setKey(int key) {
		// TODO Auto-generated method stub
		if (key > 0 && this.key == 0) {
			this.key = key;
		} // end if
		
	}// end setKey

	@Override
	public void lock(int key) {
		// TODO Auto-generated method stub
		if (key == this.key) {
			locked = true;
			System.out.println("\n"+name + " is now invincible!");
		} // end if
		
		else {
			System.out.println("\n"+name + " failed to become invincible.");
		} // end else
		
	}// end lock

	@Override
	public void unlock(int key) {
		// TODO Auto-generated method stub
		if (key == this.key) {
			locked = false;
			System.out.println("\n"+name + " is no longer invincible.");
		} // end if
		
		else {
			System.out.println("\n"+name + " is still invincible.");
		} // end else
		
	}// end unlock

	@Override
	public boolean isLocked() {
		// TODO Auto-generated method stub
		return locked;
	}// end isLocked

}// end class
