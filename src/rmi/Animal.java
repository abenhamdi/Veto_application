package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Animal extends UnicastRemoteObject implements IAnimal{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String maitre;
	private String espece;
	private Race race;
	private IDossierSuivi suivi;
	
	public Animal(String name, String maitre, String espece, Race race, IDossierSuivi suivi) throws RemoteException{
		this.name = name;
		this.maitre = maitre;
		this.espece = espece;
		this.race = race;
		this.suivi = suivi;
	}
	
	public String name() throws RemoteException{
		return name;
	}
	
	public void masterName() throws RemoteException{
		System.out.println(maitre);
	}
	
	public void espece() throws RemoteException{
		System.out.println(espece);
	}
	
	public Race race() throws RemoteException{
		return race;
	}  
	
	public IDossierSuivi getSuivi() throws RemoteException{
		return suivi;
	}
	
	public void setSuivi(IDossierSuivi suivi) throws RemoteException{
		this.suivi = suivi; 
	}
}
