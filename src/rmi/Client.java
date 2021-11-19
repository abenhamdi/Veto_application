package rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
	private Client() {}
	public static void main(String[] args) {
		String host = (args.length < 1) ? null : args[0];
		try {
			Registry registry = LocateRegistry.getRegistry(host);
			ICabinetVet stubc = (ICabinetVet) registry.lookup("ICabinetVet");
			IAnimal stub = (IAnimal)stubc.getAnimal("toto");
			IDossierSuivi stubs = (IDossierSuivi) stub.getSuivi();
			Race stubr = (Race) stub.race();
		    System.out.println(stub.name());
		    stubs.getState();
		    stub.setSuivi(new DossierSuivi("tres bien"));
		    stubs = (IDossierSuivi) stub.getSuivi();
		    System.out.println(stubs.getState());
		    stubr.getrace();
		    stubr.getLifeTime();
		    stubc.addAnimal(new Animal("tobby", "yellow", "elf", new Race("machin3","20"), new DossierSuivi("bien")));
		    System.out.println(stubc.animalsNames());
		    
		} catch (RemoteException e) {
			System.err.println("Client exception: " + e.toString());
			e.printStackTrace();
		} catch (NotBoundException e) {
			System.err.println("Client exception: " + e.toString());
			e.printStackTrace();
		}
		
	}
}
