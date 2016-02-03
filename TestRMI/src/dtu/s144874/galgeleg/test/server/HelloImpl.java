/**
 * 
 */
package dtu.s144874.galgeleg.test.server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import dtu.s144874.galgeleg.test.IHello;

/**
 * @author champen
 *
 */
public class HelloImpl extends UnicastRemoteObject implements IHello{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	protected HelloImpl() throws RemoteException {
		//super();		
	}

	@Override
	public String greet(String name) throws RemoteException {
		return "\nServer greetings " + name + "\n";
	}

}
