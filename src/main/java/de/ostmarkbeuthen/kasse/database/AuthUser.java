package de.ostmarkbeuthen.kasse.database;

/**
	* AuthUser is a typesafe way to authenticate Users
	* All operations on User which need an authentication should be in this interface,
	*/
public interface AuthUser extends User {
    /**
     * Change the balance of the users account
     *
     * @param amount Amount to change the balance
     * @param authority User vouching for the balance change
     * @return True if allowed, false otherwise
     */
	boolean changeBalance(int amount, AuthUser authority);

    /**
     *
     * Buys the product on the users account
     *
     * @param p Product the user is trying to buy
     * @return True if the User can buy the product
     */
	boolean buy(Product p);
}
