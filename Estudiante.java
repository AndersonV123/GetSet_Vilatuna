import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;
    public Estudiante(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }
    public void imprimirDetalles() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Curso: " + getCurso());
    }

}