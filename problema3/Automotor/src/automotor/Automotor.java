
package automotor;

public class Automotor {

    private String cedula_dueno;
    private String marca_vehiculo;
    private int anio_fabricacion;
    private double valor_vehiculo;
    private double valor_matricula;
    //Constructores
    public Automotor() {
        cedula_dueno = "1254623577";
        marca_vehiculo = "Lamborhini";
        anio_fabricacion = 2017;
        valor_vehiculo = 500000.500;
    }

    public Automotor(String cedula, String marca, int anio, double valor) {
        cedula_dueno = cedula;
        marca_vehiculo = marca;
        anio_fabricacion = anio;
        valor_vehiculo = valor;
    }
    //establecer
    public void establecerCedula(String c) {
        cedula_dueno = c;
    }

    public void establecerMarca(String c) {
        marca_vehiculo = c;
    }

    public void establecerAnio(int c) {
        anio_fabricacion = c;
    }

    public void establecerValorVehiculo(double c) {
        valor_vehiculo = c;
    }
    //Calcular
    public void calcularMatricula() {
        int a;
        if (anio_fabricacion == 2022) {
            a = 1;
        } else {
            a = 2022 - anio_fabricacion;
        }
        valor_matricula = (valor_vehiculo * 0.002) * a;
    }
    //obtener
    public String obtenerCedula() {
        return cedula_dueno;
    }

    public String obtenerMarca() {
        return marca_vehiculo;
    }

    public int obtenerAnio() {
        return anio_fabricacion;
    }

    public double obtenerValorVehiculo() {
        return valor_vehiculo;
    }

    public double obtenerValorMatricula() {
        return valor_matricula;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos del Automotor\n"
                + "Cedula: %s\n"
                + "Marca: %s\n"
                + "Año de Fabricación: %d\n"
                + "Valor Vehiculo: %.2f\n"
                + "Valor Matricula: %.2f\n",
                obtenerCedula(),
                obtenerMarca(),
                obtenerAnio(),
                obtenerValorVehiculo(),
                obtenerValorMatricula());
        return cadena;
    }
    
}
