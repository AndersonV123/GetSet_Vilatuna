import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Estudiante[] estudiantes = new Estudiante[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese la edad del estudiante " + (i + 1) + ": ");
            int edad = Integer.parseInt(scanner.nextLine());
            System.out.println("Ingrese el curso del estudiante " + (i + 1) + ": ");
            String curso = scanner.nextLine();
            Estudiante nuevoEstudiante = new Estudiante(nombre, edad, curso);
            estudiantes[i] = nuevoEstudiante;
        }
    }
}