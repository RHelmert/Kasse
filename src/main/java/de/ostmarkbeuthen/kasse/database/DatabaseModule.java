package de.ostmarkbeuthen.kasse.database;

import dagger.Module;
import dagger.Provides;
import dagger.Singleton;

@Module(
	library=true)
public class DatabaseModule {
	@Provides @Singleton Database providDatabase() {
		return new Database();
	}
}
