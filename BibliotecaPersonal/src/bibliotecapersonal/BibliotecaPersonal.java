package bibliotecapersonal;

import java.util.Scanner;

public class BibliotecaPersonal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion;
        Libro[] libros = new Libro[10];
        Autor[] autores = new Autor[10];

        int contador = 0;
        do {

            System.out.println("\t\t BIBLIOTECA PERSONAL");

            System.out.println("1. Ingresar datos del Libro");
            System.out.println("2. Ingresar datos del Autor del Libro");
            System.out.println("3. Salir");

            System.out.println("Ingrese la opción que desea: ");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("\t Ingresar datos del Libro :");
                    scan.nextLine();

                    for (int i = 0; i < libros.length; i++) {

                        System.out.println("Ingrese los datos del libro: " + (i + 1));
                        System.out.println();
                        System.out.println("Titulo del libro : ");
                        String titulo = scan.nextLine();

                        System.out.println("Autor del libro : ");
                        String autor = scan.nextLine();

                        System.out.println("Año del libro : ");
                        int año = scan.nextInt();

                    }
                    break;
                case 2:

                    for (int i = 0; i < autores.length; i++) {
                        System.out.println("\t Ingresar datos del Autor del Libro: " + (i + 1));
                        System.out.println("Nombre del Autor: ");
                        scan.nextLine();
                        String nombre = scan.nextLine();

                        System.out.println("Pais del Autor : ");
                        String pais = scan.nextLine();

                    }

                    break;
                case 3:
                    System.out.println("Adios");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opcion != 3);

    }

}
