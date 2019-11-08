/*
Clase Usuario
 */
package examen1_rafaelflores;

import java.util.ArrayList;

public class Usuario {
    String user, pass, nacimiento, telefono, correo, generoFav;
    ArrayList<Libro> lista = new ArrayList();

    public Usuario() {
    }

    public Usuario(String user, String pass, String nacimiento, String telefono, String correo, String generoFav) {
        this.user = user;
        this.pass = pass;
        this.nacimiento = nacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.generoFav = generoFav;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setGeneroFav(String generoFav) {
        this.generoFav = generoFav;
    }

    public void setLista(ArrayList<Libro> lista) {
        this.lista = lista;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getGeneroFav() {
        return generoFav;
    }

    public ArrayList<Libro> getLista() {
        return lista;
    }

    @Override
    public String toString() {
        return user;
    }
    
    
}
