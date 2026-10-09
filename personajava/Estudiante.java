public class Estudiante extends Persona {
    /*atributos de estudiante */
    private String carrera;
    
    /*constructores */
    public Estudiante(String cedula, String nombre, int edad, String carrera) {
        super(cedula, nombre, edad);
        this.carrera = carrera;
    }

    // Métodos Get y Set
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}