package de.ostmarkbeuthen.kasse.database.Dummy;

import de.ostmarkbeuthen.kasse.database.*;

import java.time.LocalDate;

public class DummyDatabase implements Database {
    @Override
    public User getUser(String name) {
        return null;
    }
    @Override
    public DatabaseResult<User> getUsers() {
        return null;
    }

    @Override
    public Product getProduct(String barcode) {
        return null;
    }
    @Override
    public DatabaseResult<Product> getProducts() {
        return null;
    }

    @Override
    public Event getDefaultEvent() {
        return null;
    }
    @Override
    public Event getCurrentEvent() {
        return null;
    }
    @Override
    public Event getEventForDate(LocalDate time) {
        return null;
    }


}
