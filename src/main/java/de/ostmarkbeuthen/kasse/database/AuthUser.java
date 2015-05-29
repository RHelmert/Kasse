package de.ostmarkbeuthen.kasse.database;

public interface AuthUser extends User {
    /**
     * Change the balance of the users account
     *
     * @param Amount to change the balance
     * @param User vouching for the balance change
     * @return True if allowed, false otherwise
     */
	boolean changeBalance(int amount, AuthUser authority);

    /**
     *
     * Buys the product on the users account
     *
     * @param Product
     * @return True if the User can buy the product
     */
	boolean buy(Product p);
}
