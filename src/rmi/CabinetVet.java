package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CabinetVet extends UnicastRemoteObject implements ICabinetVet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String owner;
	private Map <String, IAnimal> animals;
	
	public CabinetVet(String owner) throws RemoteException{
		animals = new HashMap<String, IAnimal>();
		this.owner = owner;
	}
	
	public CabinetVet(String owner, HashMap<String, IAnimal> animals) throws RemoteException{
		this.animals = animals;
		this.owner = owner;
	}
	
	public IAnimal getAnimal(String name) throws RemoteException{
		return animals.get(name);
	}
	
	public String getOwner() throws RemoteException{
		return owner;
	}
	
	public void addAnimal(IAnimal anim) throws RemoteException {
		animals.put(anim.name(),anim);
	}
	
	public Set<String> animalsNames() throws RemoteException{
		return animals.keySet();
	}
}
