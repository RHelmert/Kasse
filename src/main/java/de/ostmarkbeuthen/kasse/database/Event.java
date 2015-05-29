package de.ostmarkbeuthen.kasse.database;

import java.util.Date;

public interface Event {
	Date getBegin();
	Date getEnd();
	void setCost(Product prod, int cost);
}
