package de.ostmarkbeuthen.kasse.database;

import java.util.List;

class DummyDatabase implements Database {
	@Override
	User getUser(String s) {
		return null;
	}
	List<User> getUsers() {
		return null;
	}

}
