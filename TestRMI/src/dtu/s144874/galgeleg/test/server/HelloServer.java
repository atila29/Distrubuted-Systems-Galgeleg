package dtu.s144874.galgeleg.test.server;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloServer {

	public static void main(String[] args) {
		System.setSecurityManager(new RMISecurityManager());
		try {
			HelloImpl hello = new HelloImpl();
			System.setProperty("java.rmi.server.hostname","localhost");
			Registry reg = LocateRegistry.createRegistry(5040);
			reg.bind("rmidemo", hello);
			//Naming.rebind("rmi://localhost/rmidemo", hello);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AlreadyBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
