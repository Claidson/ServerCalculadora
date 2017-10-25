package com.mycompany.servercalculadora;

import java.rmi.Naming;

public class CalculadoraServer {

	public static void main(String[] args) {
		System.out.println("Iniciando servidor...");
		
		try {
			/* Registra o SecurityManager */
			System.out.println("Registrando o gerenciador de seguran�a...");
			System.setSecurityManager(new SecurityManager());
			
			/* Instancia o objeto remoto */
			Calculadora calc = new Calculadora();
			
			/* Registra o objeto remoto */
			System.out.println("\tRegistrando o objeto remoto...");
			Naming.rebind("Calculadora", calc);
			
			/* Aguarda requisi��es */
			System.out.println("\tAguardando requisi��es de clientes...");
		} catch (Exception e) {
			System.out.println("Error: "+e.getMessage());
			e.printStackTrace();
			System.exit(1);
		}
		
	}

}
