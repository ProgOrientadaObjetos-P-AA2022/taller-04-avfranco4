package entidadfinanciera;
public class Ejecutor {
    public static void main(String[] args) {

        String nombreCliente = "Joseph Martinez";
        String nombreBanco = "Banco de Loja";
        double valorCheque = 50000.250;

        EntidadFinanciera cheque1 = new EntidadFinanciera();
        cheque1.calcularComision();

        EntidadFinanciera cheque2 = new EntidadFinanciera(nombreCliente, nombreBanco, valorCheque);
        cheque2.calcularComision();

        System.out.printf("%s\n", cheque1);
        System.out.println("--------------------------------");
        System.out.println("^     ^     ^     ^     ^     ^");
        System.out.println("|     |     |     |     |     |");
        System.out.println("--------------------------------");
        System.out.printf("%s\n", cheque2);
    }
}
