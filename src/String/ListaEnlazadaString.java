/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 *
 * @author floow
 */
public class ListaEnlazadaString {
    public static void main(String[] args) {
        String persona1 = "Brayan";
        String persona2 = "Dilan";
        String persona3 = "Gabriel";
        String persona4 = "Julian";
        
        Nodo n1 = new Nodo(persona1);
        Nodo n2 = new Nodo(persona2);
        Nodo n3 = new Nodo(persona3);
        Nodo n4 = new Nodo(persona4);
        
        n1.setSiguiente(n2);
        n2.setSiguiente(n3);
        n3.setSiguiente(n4);
        
        Nodo aux = n1;
        for (int i = 0; i < 4; i++) {
            String aux2 = (String) aux.getContiene();
            System.out.println(aux2);
            aux = aux.getSiguiente();
        
        }
        
    }
}
