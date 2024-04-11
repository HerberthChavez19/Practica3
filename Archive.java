import java.util.ArrayList;

public class Archive {
    private ArrayList<Estudiante> Estudiantes;
    private ArrayList<Instructor> instructors;
    private ArrayList<Profesor> Profesors;

    // Default constructor
    public Archive() {
        this.Estudiantes = new ArrayList<>();
        this.instructors = new ArrayList<>();
        this.Profesors = new ArrayList<>();
    }

    // Overloaded constructor
    public Archive(ArrayList<Estudiante> Estudiantes, ArrayList<Instructor> instructors, ArrayList<Profesor> Profesors) {
        this.Estudiantes = Estudiantes;
        this.instructors = instructors;
        this.Profesors = Profesors;
    }

    // Methods
    public void addNewEstudiante(Estudiante Estudiante) {
        this.Estudiantes.add(Estudiante);
    }

    public void addNewInstructor(Instructor instructor) {
        this.instructors.add(instructor);
    }

    public void addNewProfesor(Profesor Profesor) {
        this.Profesors.add(Profesor);
    }

    public void showEstudiantes() {
        for(int i = 0; i < Estudiantes.size(); i++) {
            System.out.println(Estudiantes.get(i).getIdEstudiante() + "\t" + Estudiantes.get(i).getNombre() + "\t" + Estudiantes.get(i).getCorreo());
        }
    }

    public void showInstructors() {
        for(int i = 0; i < instructors.size(); i++) {
            System.out.println(instructors.get(i).getIDInstructor() + "\t" + instructors.get(i).getNombre() + "\t" + instructors.get(i).getCorreo() + "\t" + instructors.get(i).getMateria());
        }
    }


    public void showProffesors() {
        for(int i = 0; i < Profesors.size(); i++) {
            System.out.println(Profesors.get(i).getNombre() + "\t" + Profesors.get(i).getCorreo() + "\t" + Profesors.get(i).getFacultad() + "\t" + Profesors.get(i).getMateria());
        }
    }
}