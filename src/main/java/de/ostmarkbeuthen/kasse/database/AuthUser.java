package de.ostmarkbeuthen.kasse.database;

public interface AuthUser extends User {
	/**
	 *
	 */
	boolean changeBalance(int amount, AuthUser authority);

	boolean buy(Product p);
}
