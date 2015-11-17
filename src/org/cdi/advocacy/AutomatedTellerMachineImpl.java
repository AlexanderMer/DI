package org.cdi.advocacy;

import java.math.BigDecimal;

public class AutomatedTellerMachineImpl implements AutomatedTellerMachine {

	private ATMTransport transport;

	/* some code here */
	public void deposit(BigDecimal bd) {
		System.out.println("deposit called");
		transport.communicateWithBank(null);
	}

	public void withdraw(BigDecimal bd) {
		System.out.println("withdraw called");
		transport.communicateWithBank(null);
	}
	
	//transport setter
	public void setTransport(ATMTransport t){
		this.transport = t;
	}
}
