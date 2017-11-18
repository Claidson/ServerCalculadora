package com.mycompany.servercalculadora;

//import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculadoraServer {

    public static void main(String[] args) {
        System.out.println("Iniciando servidor...");

        try {
            /* Registra o SecurityManager */
            System.out.println("Registrando o gerenciador de seguranca...");
            //System.setSecurityManager(new SecurityManager());

            /* Instancia o objeto remoto */
            /* Registra o objeto remoto */
            System.out.println("\tRegistrando o objeto remoto...");
            //  Naming.rebind("Calculadora", calc);

            System.setProperty("java.rmi.server.hostname", "192.168.2.195");
            Registry reg = LocateRegistry.createRegistry(50000);
            Calculadora calc = new Calculadora();
            reg.rebind("calculadora", calc);

            /* Aguarda requisices */
            System.out.println("\tAguardando requisicoes de clientes...");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }

    }

}
