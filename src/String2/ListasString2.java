/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String2;

/**
 *
 * @author floow
 */
public class ListasString2 {
     Nodo cabeza;

    public ListasString2() {
        this.cabeza = null;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    
    //metodo para agregar el nodo al final
    public void insercionAlFinal(String valor) {
        //crea un nodo conn el valor dado
        Nodo nuevoNodo = new Nodo(valor);
        //si la lista esta vacia se convierte en la cabeza del nodo
        if (cabeza == null) {
            cabeza = nuevoNodo;
            return;
        }
        //si la lista no esta vacia, se recorre hasta el final y se agrega el nuev nodo
        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevoNodo;
    }

    //metodo que permite buscar un valor en la lista
    public boolean busqueda(String valor) {
        //se inicia una busquedad des de la cabeza
        Nodo actual = cabeza;
        //recorre la lista siempre y cuando hayan nodos obviamente xD
        while (actual != null) {
            //verifica si el valor actual, es el valor que le dimos
            if (actual.dato.equals(valor)) {
                //si es asi retorna true 
                return true;
            }
            //se avanza al siguiente nodo de la lista
            actual = actual.siguiente;
        }
        //si llega hasta el final de la lista y no encuentra nada tira false deley :v
        return false;
    }

    public void eliminacionEnPosicion(String valor) {
        //primero verificamos si la lista esta vacia
        if (cabeza == null) {
            return; // si es que esta vacia ps no eliminamos na' :c
        }
        //verificamos si el valor a eliminar esta en la cabeza 
        if (cabeza.getDato().equals(valor)) {
            cabeza = cabeza.siguiente; // si es asi se borra la cabeza
            return;
        }
        
        Nodo actual = cabeza; // se establece el nodo cabeza para comenzar a buscar desde el comienzo de la lista
        
    //el bucle se ejecuta mientras haya un siguiente nodo 
    //y el valor del siguiente nodo no sea el valor que estamos buscando
        while (actual.getSiguiente() != null && !actual.getSiguiente().getDato().equals(valor)) {
            actual = actual.getSiguiente();
        }
        
        //se verifica que no estemos en el final de la lista
        if (actual.getSiguiente() != null) {
                //reorganiza la lista sacando el nodo eliminado
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
        } else {
            System.out.println("Elemento no encontrado en la lista.");
        }
    }

    public void imprimirLista() {
        //iniciamos desde la cabeza
        Nodo actual = cabeza;
        //recorremis la lista simpre y cuando hayan nodos
        while (actual != null) {
            //imprimimos cada nodo y los separamis con -->
            System.out.print(actual.dato + " --> ");
            //avanza los nodos continuamente
            actual = actual.siguiente;
        }
        //en consola se imprimi null al final de la lista, lo cual dice que ya no hay mas nodos :D
        System.out.println("null");
    }
}
