package registrocolegio;
public class RegistroColegio {

   private String nombre_estudiante;
    private double calificacion_mat1;
    private double calificacion_mat2;
    private double calificacion_mat3;
    private double promedioCalifi;

    public RegistroColegio() {
        nombre_estudiante = "Joseph Maritnez";
        calificacion_mat1 = 10;
        calificacion_mat2 = 9.55;
        calificacion_mat3 = 8.30;
    }

    public RegistroColegio(String nombre, double calificacion1, double calificacion2, double calificacion3) {
        nombre_estudiante = nombre;
        calificacion_mat1 = calificacion1;
        calificacion_mat2 = calificacion2;
        calificacion_mat3 = calificacion3;
    }

    public void establecerNombreEstudiante(String c) {
        nombre_estudiante = c;
    }
public void establecerCalificacionMateria1(double c) {
        calificacion_mat1 = c;
    }

    public void establecerCalMateria2(double c) {
        calificacion_mat2 = c;
    }

    public void establecerCalMateria3(double c) {
        calificacion_mat3 = c;
    }
    //Calcular
    public void calcularPromedio() {
        promedioCalifi = (calificacion_mat1 + calificacion_mat2 + calificacion_mat3)/3;
    }
    //obtener
    public String obtenerNombreEstudiante(){
        return nombre_estudiante;
    }

    public double obtenerCalificacionMateria1(){
        return calificacion_mat1;
    }

    public double obtenerCalificacionMateria2(){
        return calificacion_mat2;
    }

    public double obtenerCalificacionMateria3(){
        return calificacion_mat3;
    }

    public double obtenerPromedio(){
        return promedioCalifi;
    }
    
   @Override
    public String toString(){
         String cadena = String.format("Datos del Estudiante\n"
                 + "Nombre de Estudiante: %s\n"
                 + "Calificación Materia 1: %.2f\n"
                 + "Calificación Materia 2: %.2f\n"
                 + "Calificación Materia 3: %.2f\n"
                 + "Promedio: %.2f\n",
                 obtenerNombreEstudiante(),
                 obtenerCalificacionMateria1(),
                 obtenerCalificacionMateria2(),
                 obtenerCalificacionMateria3(),
                 obtenerPromedio());
         return cadena;
    }
}
