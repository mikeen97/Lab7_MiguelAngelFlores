/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miguelangelflores_lab6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Miguel Flores
 */
public class AdministracionPersonas {

    private ArrayList<Persona> listaPersoan = new ArrayList();
    private File archivo = null;

    public AdministracionPersonas(String path) {
        archivo = new File(path);
    }

    public ArrayList<Persona> getListaPersoan() {
        return listaPersoan;
    }

    public void setListaPersoan(ArrayList<Persona> listaPersoan) {
        this.listaPersoan = listaPersoan;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "adminstrarPersoan " + "listaPersoan " + listaPersoan;
    }

    public void setPersonas(Persona p) {
        this.listaPersoan.add(p);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Persona t : listaPersoan) {
                bw.write(t.getNombre() + ";");
                bw.write(t.getApellido() + ";");
                bw.write(t.getCorreo() + ";");
                bw.write(t.getFecha() + ";");
                bw.write(t.getPais() + ";");
                bw.write(t.getNumero() + ";");
                bw.write(t.getContrasena() + ";");
            }
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }

    public void cargarArchivo() {
        if (archivo.exists()) {
            Scanner sc = null;
            listaPersoan = new ArrayList();
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaPersoan.add(new Persona(sc.next(), sc.next(), sc.next(), new SimpleDateFormat("dd/MM/yyyy").parse(sc.next()), sc.next(), sc.next(), sc.next()));
                }
                sc.close();
            } catch (Exception e) {
            }
        }
    }
}
