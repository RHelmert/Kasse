package de.ostmarkbeuthen.kasse.database;

public interface User {
	AuthUser auth(String s);
	
	String getName();
	int getBalance();
}
