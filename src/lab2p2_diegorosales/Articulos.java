package lab2p2_diegorosales;

public class Articulos {
    String titulo;
    String autor;
    String tema;
    String publicacion;
    String acceso;

    
    public Articulos(String titulo, String autor, String tema, String publicacion, String acceso){
        this.titulo=titulo;
        this.autor=autor;
        this.tema=tema;
        this.publicacion=publicacion;
        this.acceso=acceso;
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

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

    public String getAcceso() {
        return acceso;
    }

    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }
    
}
