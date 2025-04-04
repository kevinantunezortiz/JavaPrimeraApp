package appBanco;

import java.util.Scanner;

public class AppBanco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreCliente = "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldoDisponible = 1599.99;
        System.out.println(String.format("""
                Nombre del cliente: %s 
                Tipo de Cuenta: %s
                Saldo disponible: %.2f """, nombreCliente, tipoCuenta, saldoDisponible));
        int opcion = 0;

        while (opcion != 9) {
            System.out.println("""
                    Escribe el número de la opción deseada
                    1 - Consultar Saldo
                    2 - Retirar
                    3 - Depositar
                    9 - Salir
                    """);
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Saldo disponible: " + saldoDisponible + "$");
                    break;
                case 2:
                    System.out.println("Escribe la cantidad a retirar");
                    double retiro = teclado.nextDouble();
                    if (retiro < saldoDisponible) {
                        System.out.println("Se realizo el retiro correctamente");
                        saldoDisponible -= retiro;
                        System.out.println("Tu saldo restante es: " + saldoDisponible);
                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                case 3:
                    System.out.println("Escribe la cantidad a depositar");
                    double deposito = teclado.nextDouble();
                    System.out.println("Se realizo el deposito correctamente");
                    saldoDisponible += deposito;
                    System.out.println("Tu saldo es: " + saldoDisponible);
                    break;
                case 9:
                    System.out.println("Finalizando el Programa. Muchas Gracias por Usar Nuestros Servicios");
                    break;
                default:
                    System.out.println("opcion desconocida vuelva a intentar");
                    break;
            }
        }
    }
}
