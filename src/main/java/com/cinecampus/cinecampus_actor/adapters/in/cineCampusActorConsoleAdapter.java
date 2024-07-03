package com.cinecampus.cinecampus_actor.adapters.in;

import java.util.Scanner;

import com.cinecampus.cinecampus_actor.application.cineCampusActorService;
import com.cinecampus.cinecampus_actor.domain.models.cineCampusActor;

public class cineCampusActorConsoleAdapter {
    private final cineCampusActorService CampusActorService;

    public cineCampusActorConsoleAdapter(cineCampusActorService CampusActorService) {
        this.CampusActorService = CampusActorService;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Agregar Actor");
            System.out.println("2. Editar Actor");
            System.out.println("3. Eliminar Actor");
            System.out.println("4. Listar todos los Actores");
            System.out.println("5. Salir");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Ingrese el ID del Actor: ");
                    int createActorID = scanner.nextInt();
                    System.out.print("Ingrese el Nombre del Actor: ");
                    String createActorName = scanner.nextLine();
                    System.out.print("Ingrese la Nacionalidad del Actor");
                    int createActorNation = scanner.nextInt();
                    System.out.print("Ingrese la Edad del Actor: ");
                    int createActorAge = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Ingrese el ID del Genero del Actor: ");
                    String createGenreId = scanner.nextLine();
                    scanner.nextLine(); // Consume newline

                    cineCampusActor newcineCampusActor = new cineCampusActor(createActorID, createActorName, createActorNation, createGenreId, createActorAge);
                    CampusActorService.createcineCampusActor(newcineCampusActor);
                    break;

                case 2:
                    System.out.print("Ingrese el ID del Actor: ");
                    int updateActorID = scanner.nextInt();
                    System.out.print("Ingrese el Nombre del Actor: ");
                    String updateActorName = scanner.nextLine();
                    System.out.print("Ingrese la Nacionalidad del Actor");
                    int updateActorNation = scanner.nextInt();
                    System.out.print("Ingrese la Edad del Actor: ");
                    int updateActorAge = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Ingrese el ID del Genero del Actor: ");
                    String updateGenreId = scanner.nextLine();
                    scanner.nextLine(); // Consume newline

                    cineCampusActor updatecineCampusActor = new cineCampusActor(updateActorID, updateActorName, updateActorNation, updateGenreId, updateActorAge);
                    CampusActorService.updatecineCampusActor(updatecineCampusActor);
                    break;

                case 4:
                    System.out.print("Ingrese el ID del Actor a eliminar: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    CampusActorService.deletecineCampusActor(deleteId);
                    break;

                case 5:
                    CampusActorService.getAllcineCampusActors().forEach(fc -> {
                        System.out.println("ID: " + fc.getId() + ", Nombre Actor: " + fc.getActorName() + ", Nacionalidad Actor: " + fc.getActorNation() + ", Edad Actor: " + fc.getActorAge() + ",  Genero Actor: " + fc.getGenreId());
                    });
                    break;

                case 6:
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción inválida, inténtelo de nuevo.");
            }
        }
    }
}

