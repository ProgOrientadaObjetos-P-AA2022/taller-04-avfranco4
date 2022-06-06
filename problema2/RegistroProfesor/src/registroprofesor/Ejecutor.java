package registroprofesor;
public class Ejecutor {
    public static void main(String[] args) {

        String nombre = "Jhandry";
        String apellido = "Tio";
        String cedula = "1203256024";
        double sueldoBasico = 1200.50;

        RegistroProfesor profesor1 = new RegistroProfesor();
        profesor1.calcularSueldoTotal();

        RegistroProfesor profe2 = new RegistroProfesor(nombre, apellido, cedula, sueldoBasico);
        profe2.calcularSueldoTotal();

        System.out.printf("%s\n", profesor1);
        System.out.println("--------------------------------");
        System.out.println("^     ^     ^     ^     ^     ^");
        System.out.println("|     |     |     |     |     |");
        System.out.println("--------------------------------");
        System.out.printf("%s\n", profe2);
    }
}
