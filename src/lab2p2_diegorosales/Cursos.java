
package lab2p2_diegorosales;

public class Cursos {
    String titulo;
    String instructor;
    String duracion;
    String plataforma;

    public Cursos(String titulo, String instructor, String duracion, String plataforma){
    this.titulo=titulo;
    this.instructor=instructor;
    this.duracion=duracion;
    this.plataforma=plataforma;
    
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    
}
