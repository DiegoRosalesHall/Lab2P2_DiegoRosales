package lab2p2_diegorosales;

public class Libros {
    String titulo;
    String autor;
    String genero;
    String año;
    String disponibilidad;

    
    
    public Libros(String titulo, String autor, String genero, String año, String disponibilidad){
         this.año = año;
         this.titulo = titulo;
         this.autor = autor;
         this.disponibilidad = disponibilidad;
         this.genero = genero;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String Genero) {
        this.genero = Genero;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    
    
    
    
}
