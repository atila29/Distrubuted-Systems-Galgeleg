package dtu.s144874.galgeleg.test;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IHello extends Remote{
	public String greet(String name) throws RemoteException;
}
