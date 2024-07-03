package com.cinecampus;

import java.util.Scanner;

import com.cinecampus.cinecampus_actor.*;
import com.cinecampus.cinecampus_actor.domain.models.cineCampusActor;

public class Menu {
    public static void main(String[] args) {
        System.out.println("╔═══════════════════════════╗");
        System.out.println("║                           ║");
        System.out.println("║        Cine Campus        ║");
        System.out.println("║                           ║");
        System.out.println("╚═══════════════════════════╝");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("¿Qué desea realizar?:");
            System.out.println("1. Gestionar Actores");
            System.out.println("2. Gestionar Peliculas");
            System.out.println("3. Gestionar Formatos");
            System.out.println("4. Gestionar Paises");
            System.out.println("5. Salir");

            System.out.print("Opción: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            String url = "jdbc:mysql://localhost:3306/cinecampus";
            String user = "123456";
            String password = "123456";
            
            switch (option) {
                case 1:
                  break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
                }
        }
    }
}