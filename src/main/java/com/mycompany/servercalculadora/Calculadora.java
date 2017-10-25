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
	public int add(int vlrA, int vlrB) throws RemoteException {
		System.out.println("\t\tCliente remoto invocou o m�todo ADD...");
		return vlrA + vlrB;
	}
	
	/**
	 * Remote method SUB
	 */
	public int sub(int vlrA, int vlrB) throws RemoteException {
		System.out.println("\t\tCliente remoto invocou o m�todo SUB...");
		return vlrA - vlrB;
	}
	
	/**
	 * Remote method MULT
	 */
	public int mult(int vlrA, int vlrB) throws RemoteException {
		System.out.println("\t\tCliente remoto invocou o m�todo MULT...");
		return vlrA * vlrB;
	}
	
	/**
	 * Remote method DIV
	 */
	public double div(int vlrA, int vlrB) throws RemoteException {
		System.out.println("\t\tCliente remoto invocou o m�todo DIV...");
		return vlrA / vlrB;
	}
	
}
