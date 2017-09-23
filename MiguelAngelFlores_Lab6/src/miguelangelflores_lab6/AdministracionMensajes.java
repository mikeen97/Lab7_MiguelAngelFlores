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
public class AdministracionMensajes {

    private ArrayList<Mensajes> listaMensajes = new ArrayList();
    private File archivo = null;

    public AdministracionMensajes(String path) {
        archivo = new File(path);
    }

    public ArrayList<Mensajes> getListaMensajes() {
        return listaMensajes;
    }

    public void setListaMensajes(ArrayList<Mensajes> listaMensajes) {
        this.listaMensajes = listaMensajes;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setMennsajes(Mensajes p) {
        this.listaMensajes.add(p);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Mensajes t1 : listaMensajes) {
                bw.write(t1.getDueno() + ";");
                bw.write(t1.getMensaje() + ";");
                bw.write(t1.getTipo() + ";");
                bw.write(t1.getQuienLoEnvio() + ";");
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        if (archivo.exists()) {
            System.out.println("entre");
            Scanner sc = null;
            listaMensajes = new ArrayList();

            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaMensajes.add(new Mensajes(sc.next(), sc.next(), sc.next(), sc.next()));
                }
            } catch (Exception e) {
            }
            sc.close();
        } // fin if 
    }
}
