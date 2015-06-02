package de.ostmarkbeuthen.kasse.hardware.nfc;

public interface NFCEventListener {
	void contactAchieved(NFCEvent event);
	void contactLost(NFCEvent event);
}
