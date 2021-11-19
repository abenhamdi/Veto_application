package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class DossierSuivi extends UnicastRemoteObject  implements IDossierSuivi{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String state;
	
	public DossierSuivi(String state) throws RemoteException {
		this.state = state;
	}
	
	public String getState() throws RemoteException{
		return state;
	}
	
	public void setState(String state) throws RemoteException{
		this.state = state;
	}

}
