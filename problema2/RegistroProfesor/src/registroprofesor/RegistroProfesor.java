
package registroprofesor;

public class RegistroProfesor {

   private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    
    public RegistroProfesor() {
        nombre = "Raul";
        apellido = "Sarango";
        cedula = "1236547835";
        sueldoBasico = 600.50;
    }

    public RegistroProfesor(String nombre1, String apellido1, String cedula1, double sueldo) {
        nombre = nombre1;
        apellido = apellido1;
        cedula = cedula1;
        sueldoBasico = sueldo;
    }
    //establecer
    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerApellido(String c) {
        apellido = c;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerSueldoBasico(double c) {
        sueldoBasico = c;
    }
    //Calcular
    public void calcularSueldoTotal() {
        sueldoTotal = (sueldoBasico) + (sueldoBasico * 0.2);
    }
    //obtener
    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos del Profesor\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Cedula: %s\n"
                + "Sueldo Basico %.2f\n"
                + "Sueldo Total %.2f\n",
                obtenerNombre(),
                obtenerApellido(),
                obtenerCedula(),
                obtenerSueldoBasico(),
                obtenerSueldoTotal());
        return cadena;
    }
    
}
