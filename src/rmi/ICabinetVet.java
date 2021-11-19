package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Set;

public interface ICabinetVet extends Remote {
	public IAnimal getAnimal(String Name) throws RemoteException;
	public String getOwner() throws RemoteException;
	public void addAnimal(IAnimal anim) throws RemoteException;
	public Set<String> animalsNames() throws RemoteException;
}
