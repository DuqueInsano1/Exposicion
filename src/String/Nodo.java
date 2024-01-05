 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 *
 * @author floow
 */
public class Nodo {
    private Nodo siguiente;
    private String contiene;
    
    
    public Nodo(){
        setSiguiente(null);
        setContiene(null);
    }
    
     public Nodo(String c){
        setSiguiente(null);
        setContiene(c);
    }
    
    public Nodo(String c, Nodo n){
        setSiguiente(n);
        setContiene(c);
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public String getContiene() {
        return contiene;
    }

    public void setContiene(String contiene) {
        this.contiene = contiene;
    }
    
        
}
