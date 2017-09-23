/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miguelangelflores_lab6;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Miguel Flores
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private String correo;
    private Date fecha;
    private String pais;
    private String numero;
    private String contrasena;
    private ArrayList<Mensajes> ListMensajes = new ArrayList();
    private ArrayList<Mensajes> ListMensajesNoLeidos = new ArrayList();
    private ArrayList<Mensajes> ListMensajesLeidos = new ArrayList();
    private ArrayList<Mensajes> ListMensajesNoDeseados = new ArrayList();
    private ArrayList<Mensajes> ListMensajesSpam = new ArrayList();
    private ArrayList<Mensajes> ListMensajesBorradores = new ArrayList();
    private ArrayList<Mensajes> ListMensajesEnviados = new ArrayList();
    private ArrayList<Mensajes> ListMensajesEliminados = new ArrayList();
    private ArrayList<Mensajes> ListMensajesImportantes = new ArrayList();
    
    public Persona(String nombre, String apellido, String correo, Date fecha, String pais, String numero, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fecha = fecha;
        this.pais = pais;
        this.numero = numero;
        this.contrasena = contrasena;
    }
    
    public Persona() {
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getCorreo() {
        return correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public Date getFecha() {
        return fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public String getPais() {
        return pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getContrasena() {
        return contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    public ArrayList<Mensajes> getListMensajesNoLeidos() {
        return ListMensajesNoLeidos;
    }
    
    public void setListMensajesNoLeidos(Mensajes x) {
        ListMensajesNoLeidos.add(x);
    }
    
    public ArrayList<Mensajes> getListMensajesLeidos() {
        return ListMensajesLeidos;
    }
    
    public void setListMensajesLeidos(Mensajes x) {
        ListMensajesLeidos.add(x);
    }
    
    public ArrayList<Mensajes> getListMensajesNoDeseados() {
        return ListMensajesNoDeseados;
    }
    
    public void setListMensajesNoDeseados(Mensajes x) {
        ListMensajesNoDeseados.add(x);
    }
    
    public ArrayList<Mensajes> getListMensajesSpam() {
        return ListMensajesSpam;
    }
    
    public void setListMensajesSpam(Mensajes x) {
        ListMensajesSpam.add(x);
    }
    
    public ArrayList<Mensajes> getListMensajesBorradores() {
        return ListMensajesBorradores;
    }
    
    public void setListMensajesBorradores(Mensajes x) {
         ListMensajesBorradores.add(x);
    }
    
    public ArrayList<Mensajes> getListMensajesEnviados() {
        return ListMensajesEnviados;
    }
    
    public void setListMensajesEnviados(Mensajes x) {
        ListMensajesEnviados.add(x);
    }
    
    public ArrayList<Mensajes> getListMensajesEliminados() {
        return ListMensajesEliminados;
    }
    
    public void setListMensajesEliminados(Mensajes x) {
        ListMensajesEliminados.add(x);
    }
    
    public ArrayList<Mensajes> getListMensajesImportantes() {
        return ListMensajesImportantes;
    }
    
    public void setListMensajesImportantes(Mensajes x) {
        this.ListMensajesImportantes = ListMensajesImportantes;
    }
    
    public ArrayList<Mensajes> getListMensajes() {
        return ListMensajes;
    }
    
    public void setListMensajes(Mensajes x) {
        ListMensajes.add(x);
    }
    
    @Override
    public String toString() {
        return "nombre: " + nombre + ", correo: " + correo;
    }
    
}
