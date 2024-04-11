import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Archive archive = new Archive(); // For saving registers in lists
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("---------------------");
            System.out.println("Registro de personas");
            System.out.println("1. Registrar a un estudiante \n2. Registrar a un instructor \n3. Registrar a un profesor");
            System.out.println("4. Mostrar estudiantes \n5. Mostrar instructores \n6. Mostrar profesores \n7. Salir \nTu opción: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1: {
                    System.out.println("---------------------");
                    Estudiante Estudiante = new Estudiante();

                    // Obtaining Estudiante info
                    System.out.println("Nombre: ");
                    Estudiante.setNombre(sc.nextLine());
                    System.out.println("Número de estudiante: ");
                    Estudiante.setIdEstudiante(sc.nextLine());
                    System.out.println("Correo electrónico: ");
                    Estudiante.setCorreo(sc.nextLine());
                    System.out.println("CUM: ");
                    Estudiante.setCUM(sc.nextDouble());

                    // Adding Estudiante to the list
                    archive.addNewEstudiante(Estudiante);
                    break;
                }
                case 2: {
                    System.out.println("---------------------");
                    Instructor instructor = new Instructor();

                    // Obtaining instructor info
                    System.out.println("Nombre: ");
                    instructor.setNombre(sc.nextLine());
                    System.out.println("Número de estudiante: ");
                    instructor.setIDInstructor(sc.nextLine());
                    System.out.println("Correo electrónico: ");
                    instructor.setCorreo(sc.nextLine());
                    System.out.println("Materia: ");
                    instructor.setMateria(sc.nextLine());
                    System.out.println("CUM: ");
                    instructor.setCUM(sc.nextDouble());
                    System.out.println("Salario: ");
                    instructor.setSalario(sc.nextDouble());

                    // Adding instructor to the list
                    archive.addNewInstructor(instructor);
                    break;
                }
                case 3: {
                    System.out.println("---------------------");
                    Profesor Profesor = new Profesor();

                    // Obtaining Profesor info
                    System.out.println("Facultad: ");
                    Profesor.setFacultad(sc.nextLine());
                    System.out.println("Nombre: ");
                    Profesor.setNombre(sc.nextLine());
                    System.out.println("Correo electrónico: ");
                    Profesor.setCorreo(sc.nextLine());
                    System.out.println("Materia: ");
                    Profesor.setMateria(sc.nextLine());
                    System.out.println("Salario: ");
                    Profesor.setSalario(sc.nextDouble());


                    // Adding Profesor to the list
                    archive.addNewProfesor(Profesor);
                    break;
                }
                case 4:
                    System.out.println("---------------------");
                    System.out.println("Lista de estudiantes: ");
                    archive.showEstudiantes();
                    break;
                case 5:
                    System.out.println("---------------------");
                    System.out.println("Lista de instructores");
                    archive.showInstructors();
                    break;
                case 6:
                    System.out.println("---------------------");
                    System.out.println("Lista de profesores");
                    archive.showProffesors();
                    break;
                case 7:
                    System.out.println("Adiós...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (option != 7);
    }
}