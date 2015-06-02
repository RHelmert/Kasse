package de.ostmarkbeuthen.kasse.database;

/**
 * An unauthenticated User
 */

public interface User {
	/**
	 * Authenticate a User with their password
	 * @param password the password to try
	 * @return An AuthUser for this User if the password is correct, null otherwise
	 */
	AuthUser auth(String password);
	/**
	 * Authenticate the User on someone elses authority
	 * @param authority The authority trying to authenticate the User
	 * @return An AuthUser for this User if authority is allowed to Authenticate Users, null otherwise
	 */
	AuthUser auth(AuthUser authority);

	/**
	 * @return The Users name
	 */
	String getName();
	/**
	 * @return the Users balance in cents
	 */
	int getBalance();
}
