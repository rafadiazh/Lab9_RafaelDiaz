/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_rafaeldiaz;

import java.util.Date;

/**
 *
 * @author Rafael
 */
public class Mensajes {
    String emisor,receptor;
    Date fechaenvio;
    String contenido;

    public Mensajes(String emisor, String receptor, Date fechaenvio, String contenido) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.fechaenvio = fechaenvio;
        this.contenido = contenido;
    }

    public Mensajes() {
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public Date getFechaenvio() {
        return fechaenvio;
    }

    public void setFechaenvio(Date fechaenvio) {
        this.fechaenvio = fechaenvio;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return contenido;
    }
    
}
