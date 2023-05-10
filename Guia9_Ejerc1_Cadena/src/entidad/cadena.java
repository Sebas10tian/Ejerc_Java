/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Chiva
 */
public class cadena {
    
    private String frase;
    private int longitud;

    public cadena() {
    }

    public cadena(String frase) {
        this.frase = frase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }
    
    
    
    
}
