/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miguelangelflores_lab6;

/**
 *
 * @author Miguel Flores
 */
public class Mensajes {

    private String tipo;
    private String mensaje;
    private String dueno;
    private String quienLoEnvio;

    public Mensajes(String tipo, String mensaje, String dueno, String quienLoEnvio) {
        this.tipo = tipo;
        this.mensaje = mensaje;
        this.dueno = dueno;
        this.quienLoEnvio = quienLoEnvio;
    }

    public Mensajes() {
    }

    public String getQuienLoEnvio() {
        return quienLoEnvio;
    }

    public void setQuienLoEnvio(String quienLoEnvio) {
        this.quienLoEnvio = quienLoEnvio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    @Override
    public String toString() {
        return "mensaje: " + mensaje + ", dueno: " + dueno;
    }

}
