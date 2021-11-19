package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IAnimal extends Remote{
	public String name() throws RemoteException;
	public void masterName() throws RemoteException;
	public void espece() throws RemoteException;
	public Race race() throws RemoteException;
	public IDossierSuivi getSuivi() throws RemoteException;
	public void setSuivi(IDossierSuivi suivi) throws RemoteException;
}
