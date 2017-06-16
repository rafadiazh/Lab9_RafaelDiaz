/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_rafaeldiaz;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class AdminAgenda {
    ArrayList<Contactos> contactos = new ArrayList();
    File archivo=null;

    public AdminAgenda(String path) {
        archivo=new File(path);
    }

    public ArrayList<Contactos> getContactos() {
        return contactos;
    }

    public void setContactos(ArrayList<Contactos> contactos) {
        this.contactos = contactos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public void setContactos(Contactos c){
        this.contactos.add(c);
    }
    public void cargarArchivo(){
        try {
            contactos = new ArrayList();
            Contactos temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp =(Contactos)objeto.readObject())!= null){
                        contactos.add(temp);
                        
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
                
            }
        } catch (Exception e) {}
    }
    
    public void escribirArchivo(){
        FileOutputStream fo = null;
        ObjectOutputStream oo = null;
        try {
            fo = new FileOutputStream(archivo);
            oo = new ObjectOutputStream(fo);
            for (Contactos t : contactos) {
                oo.writeObject(t);
            }
            oo.flush();
        } catch (Exception e) {
        }
        try {
            oo.close();
            oo.close();
        } catch (Exception e) {
        }
    }
}
