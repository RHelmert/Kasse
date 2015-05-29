package de.ostmarkbeuthen.kasse.database;

import dagger.Module;
import dagger.Provides;
import de.ostmarkbeuthen.kasse.database.Dummy.DummyDatabase;

import javax.inject.Singleton;

@Module(
	library=true)
public class DatabaseModule {
	@Provides @Singleton Database provideDatabase() {
		return new DummyDatabase();
	}
}
