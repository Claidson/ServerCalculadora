package com.mycompany.servercalculadora;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calculadora extends UnicastRemoteObject implements CalculadoraInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Calculadora() throws RemoteException {};
	
	/**
	 * Remote method ADD
	 */
	public int soma(int vlrA, int vlrB) throws RemoteException {
		System.out.println("\t\tCliente remoto invocou o metodo ADD...");
		return vlrA + vlrB;
	}
	
	/**
	 * Remote method SUB
	 */
	public int sub(int vlrA, int vlrB) throws RemoteException {
		System.out.println("\t\tCliente remoto invocou o metodo SUB...");
		return vlrA - vlrB;
	}
	
	/**
	 * Remote method MULT
	 */
	public int multi(int vlrA, int vlrB) throws RemoteException {
		System.out.println("\t\tCliente remoto invocou o metodo MULT...");
		return vlrA * vlrB;
	}
	
	/**
	 * Remote method DIV
	 */
	public double div(int vlrA, int vlrB) throws RemoteException {
		System.out.println("\t\tCliente remoto invocou o metodo DIV...");
		return vlrA / vlrB;
	}
	
}
