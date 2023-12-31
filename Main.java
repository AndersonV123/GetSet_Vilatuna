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
        for (int i = 0; i < 10; i++) {
            System.out.println("Detalles del estudiante " + (i + 1) + ": ");
            estudiantes[i].imprimirDetalles();
        }

        System.out.println("Ingrese el número de estudiante que desea modificar (1-10): ");
        int estudianteAModificar = Integer.parseInt(scanner.nextLine()) - 1;
        if (estudianteAModificar >= 0 && estudianteAModificar < 10) {
            System.out.println("Ingrese el nuevo nombre del estudiante: ");
            estudiantes[estudianteAModificar].setNombre(scanner.nextLine());
            System.out.println("Ingrese la nueva edad del estudiante: ");
            estudiantes[estudianteAModificar].setEdad(Integer.parseInt(scanner.nextLine()));
            System.out.println("Ingrese el nuevo curso del estudiante: ");
            estudiantes[estudianteAModificar].setCurso(scanner.nextLine());

            System.out.println("Detalles del estudiante modificado: ");
            estudiantes[estudianteAModificar].imprimirDetalles();
        } else {
            System.out.println("Número de estudiante inválido.");
        }

        scanner.close();
    }
}