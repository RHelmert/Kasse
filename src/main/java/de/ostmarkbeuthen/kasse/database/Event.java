package de.ostmarkbeuthen.kasse.database;

import java.util.Date;

public interface Event {
	public Date getBegin();
	public Date getEnd();
	public void setCost(Product prod, int cost);
}
