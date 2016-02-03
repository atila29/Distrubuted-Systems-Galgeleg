/**
 * 
 */
package dtu.s144874.galgeleg.test.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import dtu.s144874.galgeleg.test.IHello;

/**
 * @author champen
 *
 */
public class HelloClient {

	/**
	 * @param args
	 * @throws Exception 
	 * @throws RemoteException 
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws Exception {
		String url = "rmi://"+args[0] + ":5040/rmidemo";
		IHello greet = (IHello)Naming.lookup(url);
		String serverReply = greet.greet("cmp");
		System.out.println("reply: " + serverReply);
	}

}
