public class Main {
    public static void main(String[] args) {

        //Instanciar la clase
        Cuenta minCuenta= new Cuenta("123456","Ahorro",150000);
        System.out.println("Saldo minimo: "+minCuenta.getSaldoMinimo());
        minCuenta.consignar(80000);
        System.out.println("Saldo Actual: "+minCuenta.getSaldoActual());
        minCuenta.retirar(250000);
        System.out.println("Saldo Actual: "+minCuenta.getSaldoActual());
        minCuenta.setNumero("9569697"); //Aqui es donde se modifica el numero de cuenta con un setter
        System.out.println(minCuenta.toString());
        System.out.println("-----------------------------");

        Cuenta pedroCuenta= new Cuenta("455456","prestamo",5000);
        System.out.println(pedroCuenta.toString());
    }
}
