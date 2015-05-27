package de.ostmarkbeuthen.kasse.database;

import java.util.List;
import java.time.LocalDate;

public interface Database {
	User getUser(String name);
	List<? extends User> getUsers();

	Product getProduct(String barcode);
	List<? extends Product> getProducts();

	Event getDefaultEvent();
	Event getCurrentEvent();
	Event getEventForDate(LocalDate time);

}
