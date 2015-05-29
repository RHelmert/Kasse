package de.ostmarkbeuthen.kasse.database;

public interface Product {
	String getBarcode();
	int getCurrentCost();
	int getCost(Event e);
}
