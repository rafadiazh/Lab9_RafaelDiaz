/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_rafaeldiaz;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class Contactos implements Serializable{
    static final long SerialVersionUID=777L;
    ArrayList<Mensajes>mensajes = new ArrayList();
    String nombre;
    int edad;
    String numerotelefonico;
    String correoelectronico,direccion;

    public Contactos(String nombre, int edad, String numerotelefonico, String correoelectronico, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.numerotelefonico = numerotelefonico;
        this.correoelectronico = correoelectronico;
        this.direccion = direccion;
    }

    public Contactos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumerotelefonico() {
        return numerotelefonico;
    }

    public void setNumerotelefonico(String numerotelefonico) {
        this.numerotelefonico = numerotelefonico;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
