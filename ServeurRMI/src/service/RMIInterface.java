package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import inventdoa.Produits;

public interface RMIInterface extends Remote {
    void addS(Produits produits) throws RemoteException;
    List<Produits> getS() throws RemoteException;
    void updateS(Produits produits) throws RemoteException;
    void deleteS(int id) throws RemoteException;
    
    void Recherche(String nom) throws RemoteException;
}
