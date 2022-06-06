package registrocolegio;
public class Ejecutor {
    public static void main(String[] args) {
        String nombre = "Camilo Godoy";
        double cal1 = 8.55;
        double cal2 = 7.35;
        double cal3 = 6.25;

        RegistroColegio estudiante = new RegistroColegio();
        estudiante.calcularPromedio();

        RegistroColegio estu2 = new RegistroColegio(nombre, cal1, cal2, cal3);
        estu2.calcularPromedio();

        System.out.printf("%s\n", estudiante);
        System.out.println("--------------------------------");
        System.out.println("^     ^     ^     ^     ^     ^");
        System.out.println("|     |     |     |     |     |");
        System.out.println("--------------------------------");
        System.out.printf("%s\n", estu2);
    }

}  
    

