/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String2;

import java.util.Scanner;

/**
 *
 * @author floow
 */
public class Main {
      public static void main(String[] args) {
        ListasString2 lista = new ListasString2();
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        while (opcion != 4) {
            System.out.println("\nOpciones:");
            System.out.println("1. Agregar palabra");
            System.out.println("2. Buscar palabra");
            System.out.println("3. Eliminar palabra");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese una palabra para agregar a la lista: ");
                    String palabraAgregar = scanner.nextLine();
                    lista.insercionAlFinal(palabraAgregar);
                    System.out.println("Palabra agregada a la lista.");
                    break;
                case 2:
                    System.out.print("Ingrese una palabra para buscar en la lista: ");
                    String palabraBuscar = scanner.next();
                    boolean encontrado = lista.busqueda(palabraBuscar);
                    if (encontrado) {
                        System.out.println("La palabra " + palabraBuscar + " está en la lista.");
                    } else {
                        System.out.println("La palabra " + palabraBuscar + " no está en la lista.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese una palabra para eliminar de la lista: ");
                    String palabraEliminar = scanner.next();
                    lista.eliminacionEnPosicion(palabraEliminar);
                    System.out.println("Palabra eliminada de la lista.");
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            System.out.println("Lista actual:");
            lista.imprimirLista();
        }

        scanner.close();
    }
}
