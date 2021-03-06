package de.ostmarkbeuthen.kasse.database;

import java.util.List;
import java.time.LocalDate;

public interface Database {
	User getUser(String name);
	DatabaseResult<User> getUsers();

    Product newProduct();
	Product getProduct(String barcode);
    DatabaseResult<Product> getProducts();

    Event newEvent();
	Event getDefaultEvent();
	Event getCurrentEvent();
	Event getEventForDate(LocalDate time);

}
