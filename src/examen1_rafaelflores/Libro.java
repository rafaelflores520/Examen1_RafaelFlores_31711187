/*
Clase Libro
 */
package examen1_rafaelflores;

public class Libro {
    String titulo, descrip, genero, autor, fechaLanzamiento;
    int puntos, copias, edicion;
    double precio;

    public Libro() {
    }

    public Libro(String titulo, String descrip, String genero, String autor, String fechaLanzamiento, int puntos, int copias, int edicion, double precio) {
        this.titulo = titulo;
        this.descrip = descrip;
        this.genero = genero;
        this.autor = autor;
        this.fechaLanzamiento = fechaLanzamiento;
        this.puntos = puntos;
        this.copias = copias;
        this.edicion = edicion;
        this.precio = precio;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescrip() {
        return descrip;
    }

    public String getGenero() {
        return genero;
    }

    public String getAutor() {
        return autor;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getCopias() {
        return copias;
    }

    public int getEdicion() {
        return edicion;
    }

    public double getPrecio() {
        return precio;
    }
    
    
}
