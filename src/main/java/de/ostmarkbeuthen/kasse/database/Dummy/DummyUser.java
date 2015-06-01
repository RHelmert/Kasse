package de.ostmarkbeuthen.kasse.database.Dummy;

import de.ostmarkbeuthen.kasse.database.AuthUser;
import de.ostmarkbeuthen.kasse.database.User;

/**
 * Created by linus_000 on 27.05.2015.
 */
public class DummyUser implements User {

    private String name;
    private String password;
    int balance;

    public DummyUser(String name, String password) {
      this.name = name;
      this.password = password;
    }

    @Override
    public AuthUser auth(String s) {
        if (s.equals(password)) {
            return new DummyAuthUser(this);
        } else {
            return null;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}
