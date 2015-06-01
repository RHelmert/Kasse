package de.ostmarkbeuthen.kasse.hardware.nfc;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module(
	library=true
) public class NFCModule {
	@Provides @Singleton NFC provideNFC() {
		return null;
	}
}
