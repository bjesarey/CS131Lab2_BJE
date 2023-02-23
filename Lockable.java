/**
 * Creates an interface to be used in the Wizard class
 */

/**
 * @author brandonesarey
 * @version 1.3
 * Lab 2.1
 * Semester year Spring 2023
 */
public interface Lockable {
	public void setKey(int key);
	public void lock(int key);
	public void unlock(int key);
	public boolean isLocked();
}//end Lockable
