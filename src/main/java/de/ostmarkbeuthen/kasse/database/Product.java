package de.ostmarkbeuthen.kasse.database;

interface Product {
	String getBarcode();
	int getCurrentCost();
	int getCost(Event e);
}
