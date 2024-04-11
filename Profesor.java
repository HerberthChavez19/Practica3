public class Profesor extends Persona {
    private double salario;
    private String facultad;
    private String materia;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Profesor(){

    }

    public Profesor(String nombre, int telefono, String correo, String materia, double salario, String facultad){
        super(nombre, telefono, correo);
        this.materia = materia;
        this.salario = salario;
        this.facultad = facultad;
    }

    public void impartiendoClase(){
        System.out.println("El profesor esta brindando clase.");
    }
}
