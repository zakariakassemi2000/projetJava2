package service;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import inventdoa.Produits;

public class Server extends UnicastRemoteObject implements RMIInterface {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final List<Produits> users;

    // Constructeur
    protected Server() throws RemoteException {
        super();
        users = new ArrayList<>();
    }

   

    public static void main(String[] args) {
        try {
            // Démarrer le registre RMI
            LocateRegistry.createRegistry(1602);
            System.out.println("Registre RMI démarré sur le port 1602.");

            // Instancier et enregistrer l'objet distant
            Server server = new Server();
            // Enregistrer sous le nom "nn"
            Naming.rebind("rmi://localhost:1602/nn", server);
            System.out.println("Service StudentService enregistré.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



	@Override
	public void addS(Produits produits) throws RemoteException {
		// TODO Auto-generated method stub
		
	}



	@Override
	public List<Produits> getS() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void updateS(Produits produits) throws RemoteException {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void deleteS(int id) throws RemoteException {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void Recherche(String nom) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
}
