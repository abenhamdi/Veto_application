package rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.HashMap;


public class Server {
	public final String CODE_BASE_PATH = "file:home/ayooub/eclipse-workspace/rmi/src/rmi";
	
	public Server() {
		System.setProperty( "java.rmi.server.codebase", CODE_BASE_PATH);
		System.setSecurityManager(new SecurityManager());
		System.setProperty("java.security.policy", "animal.policy");
    }
	
	
	
	public static void main(String args[]) {
		
		try {
			Animal anim = new Animal("robby", "red", "chat", new Race("machin","20"), new DossierSuivi("bien"));
			Animal anim2 = new Animal("toto", "green", "chien", new Race("machin2","22"), new DossierSuivi("pas bien"));
			HashMap <String, IAnimal> animals = new HashMap<String, IAnimal>();
			animals.put("robby", anim);
			animals.put("toto", anim2);
			CabinetVet cabinet = new CabinetVet("sigmunf freud", animals);
			Registry registry = LocateRegistry.createRegistry(1099);
			if(registry == null) {
				System.err.println("RmiRegistry not found");
			}
			else {
				registry.rebind("ICabinetVet", cabinet);
				System.err.println("Server ready");
			}
		} catch (RemoteException e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}
	}
}
