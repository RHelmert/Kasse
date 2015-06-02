package de.ostmarkbeuthen.kasse.database.Dummy;

import de.ostmarkbeuthen.kasse.database.AuthUser;
import de.ostmarkbeuthen.kasse.database.Product;

/**
 * Created by linus_000 on 27.05.2015.
 */
public class DummyAuthUser implements AuthUser {

    DummyUser user;

    DummyAuthUser(DummyUser u) {
        user = u;
    }

    @Override
    public boolean changeBalance(int amount, AuthUser authority) {
        return false;
    }

    @Override
    public boolean buy(Product p) {
        return false;
    }

    @Override
    public AuthUser auth(String s) {
        return this;
    }

		public AuthUser auth(AuthUser authority) {
			return this;
		}

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getBalance() {
        return 0;
    }
}
