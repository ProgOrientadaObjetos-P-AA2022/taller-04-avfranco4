package entidadfinanciera;

public class EntidadFinanciera {

    private String nombre_cliente;
    private String nombre_banco;
    private double valor_cheque;
    private double comision;
    //Constructores
    public EntidadFinanciera() {
        nombre_cliente = " Camilo Godoy";
        nombre_banco = "Banco Pacifital";
        valor_cheque = 5000.300;
    }

    public EntidadFinanciera(String nom, String ban, double val) {
        nombre_cliente = nom;
        nombre_banco = ban;
        valor_cheque = val;
    }
    //establecer
    public void establecerNombreCliente(String c) {
        nombre_cliente = c;
    }

    public void establecerNombreBanco(String c) {
        nombre_banco = c;
    }

    public void establecerValorCheque(double c) {
        valor_cheque = c;
    }
    //calcular
    public void calcularComision() {
        comision = valor_cheque * 0.003;
    }
    //obtener
    public String obtenerNombreCliente() {
        return nombre_cliente;
    }

    public String obtenerNombreBanco() {
        return nombre_banco;
    }

    public double obtenerValorCheque() {
        return valor_cheque;
    }

    public double obtenerComision() {
        return comision;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos del Cheque\n"
                + "Nombre: %s\n"
                + "Banco: %s\n"
                + "Valor del Cheque %.2f\n"
                + "Comision %.2f\n",
                obtenerNombreCliente(),
                obtenerNombreBanco(),
                obtenerValorCheque(),
                obtenerComision());
        return cadena;
    }
    
}
