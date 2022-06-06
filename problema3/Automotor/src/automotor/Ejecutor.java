
package automotor;

public class Ejecutor {
    public static void main(String[] args) {
        
        Automotor carro = new Automotor("1263549526", "Lanborghini", 2014,
                300000.00);
        carro.calcularMatricula();
        System.out.printf("%s\n", carro);
        
        Automotor vehiculo2 = new Automotor("1542987757", "Ferrari", 2014,
                500000.00);
        vehiculo2.calcularMatricula();
        System.out.printf("%s\n", vehiculo2);
    }
}
