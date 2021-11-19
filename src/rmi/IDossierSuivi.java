package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IDossierSuivi extends Remote{
	String getState() throws RemoteException;
	void setState(String state) throws RemoteException;
}
