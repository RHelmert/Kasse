package de.ostmarkbeuthen.kasse.hardware.nfc;

public interface NFC {
	void addEventListener(NFCEventListener listener);
	boolean hasContact();
	//getData(int length);
}
