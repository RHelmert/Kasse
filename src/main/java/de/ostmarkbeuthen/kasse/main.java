package de.ostmarkbeuthen.kasse;

import de.ostmarkbeuthen.kasse.database.Database;
import dagger.Inject;

class Main {
	@Inject Database d;
	static void main(String[] argv) {
		new Main();
	}
}
