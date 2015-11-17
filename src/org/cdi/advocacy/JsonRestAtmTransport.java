package org.cdi.advocacy;

public class JsonRestAtmTransport implements ATMTransport {

	@Override
	public void communicateWithBank(byte[] datapacket) {
		System.out.println("communicating with bank via Json transport");
	}

}
