/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack;

/**
 *
 * @author floow
 */
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese un número (o -1 para detenerse): ");
            int dato = scanner.nextInt();

            if (dato == -1) {
                continuar = false;
            } else {
                lista.agregarAlFinal(dato);
            }
        }

        System.out.println("Lista enlazada ingresada:");
        lista.imprimirLista();
    }
}

