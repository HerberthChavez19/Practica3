public class Estudiante extends Persona {
    private String idEstudiante;
    private double CUM;

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public double getCUM() {
        return CUM;
    }

    public void setCUM(double cUM) {
        CUM = cUM;
    }

    public Estudiante(){

    }

    public Estudiante(String nombre, int telefono, String correo, String idEstudiante, double CUM){
        super(nombre, telefono, correo);
        this.idEstudiante = idEstudiante;
        this.CUM = CUM;
    }

    public void recibiendoClase(){
        System.out.println("El alumno esta tomando apuntes.");
    }

    public void attendPractices(){
        System.out.println("El alumno se encuentra en laboratorio aprendiendo.");
    }

}
