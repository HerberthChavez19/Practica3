public class Instructor extends Estudiante {
    private String IDInstructor;
    private double CUM;
    private String materia;
    private double salario;

    public String getIDInstructor() {
        return IDInstructor;
    }

    public void setIDInstructor(String iDInstructor) {
        IDInstructor = iDInstructor;
    }

    public double getCUM() {
        return CUM;
    }

    public void setCUM(double cUM) {
        CUM = cUM;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Instructor(){

    }

    public Instructor(String nombre, int telefono, String correo, String IDInstructor, double CUM, String materia, double salario){
        super(nombre, telefono, correo, IDInstructor, CUM);
        this.materia = materia;
        this.salario = salario;
    }

    @Override
    public void attendPractices(){
        System.out.println("El instructor esta enseniando en un laboratorio");
    }
    
}