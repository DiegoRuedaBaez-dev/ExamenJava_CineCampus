package com.cinecampus.cinecampus_format.adapters.in;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.cinecampus.Menu;
import com.cinecampus.cinecampus_format.application.cineCampusFormatService;
import com.cinecampus.cinecampus_format.domain.cineCampusFormat;

public class cineCampusFormatConsoleAdapter {
    private final cineCampusFormatService cinecampusformatservice;

    public cineCampusFormatConsoleAdapter(cineCampusFormatService cinecampusformatservice) {
        this.cinecampusformatservice = cinecampusformatservice;
    }

    public void start(){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("1. Agregar formato");
            System.out.println("2. Editar formato");
            System.out.println("3. Buscar formato");
            System.out.println("4. Eliminar formato");
            System.out.println("5. Listar todos los formatos");
            System.out.println("6. Salir");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Ingrese la descripcion del formato: ");
                    String descripcion = sc.nextLine();

                    cinecampusformatservice.createFormato(descripcion);
                    System.out.println("Formato creado correctamente");
                    break;
                
                case 2:
                System.out.println("Ingrese el id del formato a editar: ");
                int id = sc.nextInt();

                System.out.println("Agregue la nueva descripcion: ");
                String up_descricion = sc.nextLine();

                cineCampusFormat ccf = new cineCampusFormat(id,up_descricion);
                cinecampusformatservice.updateFormato(ccf);
                System.out.println("Actualizado correctamente");
                break;
                case 3:
                System.out.println("Ingrese el id del formato a buscar: ");
                int findId = sc.nextInt();

                Optional<com.cinecampus.cinecampus_format.domain.models.cineCampusFormat> formatos = cinecampusformatservice.findFormat(findId);
                formatos.ifPresentOrElse(
                    F -> System.out.println("id: " + F.getId_formato() + ", descripcion: " + F.getDescripcion()), 
                    () -> System.out.println("No se encontro formato con el id " + findId));

                break;

                case 4:
                    System.out.println("Ingrese el id del formato a eliminar: ");
                    int deleteId = sc.nextInt();

                    cinecampusformatservice.deleteFormato(deleteId);
                    System.out.println("Eliminado correctamente");

                case 5:
                List<cineCampusFormat> todos = cinecampusformatservice.findAllFormats();
                for (com.cinecampus.cinecampus_format.domain.models.cineCampusFormat f : todos) {
                    System.out.println("Id: " + f.getId_formato() + "\nDescripcion: " + f.getDescripcion());
                }
                break;

                case 6: 
                Menu.main();
                break;
                default:
                    break;
            }
        }
    }
}