package adivinanumero;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numAleatorio = new Random().nextInt(100);
        int numIntentos = 5;
        boolean gano = false;
        System.out.println(numAleatorio);
        while(numIntentos>0){
            System.out.println(String.format("Numero de intentos %d",numIntentos));
            System.out.println("Escribe un numero");
            int numero =  teclado.nextInt();
            if(numAleatorio==numero){
                gano = true;
                break;
            }
            if(numero>numAleatorio){
                System.out.println("El numero introducido es mayor");
            }else{
                System.out.println("El numero es menor");
            }
            numIntentos--;
        }
        if(gano)  System.out.println("Adivinaste el número");
        else  System.out.println("Perdiste No Adivinaste el número");
    }
}
