package de.ostmarkbeuthen.kasse.database;

import dagger.Module;
import dagger.Provides;

@Module(
	library=true
)
class DatabaseModule {
	@Provides Event provideEvent () {
		return null;
	}
}
