package com.cinecampus;
import com.cinecampus.cinecampus_actor.*;
import java.util.Scanner;

public class Menu {
    public static void main() {
        //hace que las conexiones se cierren automáticamente a los 5 minutos
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
            scanner.nextLine(); // Limpiar el buffer

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