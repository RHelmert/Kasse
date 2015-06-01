package de.ostmarkbeuthen.kasse.hardware.nfc;

interface NFC {
	void addEventListener(NFCEventListener listener);
	boolean hasContact();
	//getData(int length);
}
