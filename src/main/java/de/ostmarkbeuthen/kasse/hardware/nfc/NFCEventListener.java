package de.ostmarkbeuthen.kasse.hardware.nfc;

interface NFCEventListener {
	void contactAchieved(NFCEvent event);
	void contactLost(NFCEvent event);
}
