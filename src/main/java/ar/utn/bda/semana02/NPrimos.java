package ar.utn.bda.semana02;

import static ar.utn.bda.util.MathUtil.isPrime;

public class NPrimos {

    public static void primerosNPrimos(int limit){
        int contador = 1;
        int numero = 2;
        while (contador <= limit){
            if (isPrime(numero)){
                System.out.println(numero + ", es primo.");
                contador++;
            }
            numero++;
        }
    }

    private static void primeros100Primos(){ // Los primeros 100 números primos.
        int contador = 1;
        int numeros = 2;
        while (contador <= 100){
            if (isPrime(numeros)){
                System.out.println(numeros + " Es el primo número: " + contador);
                contador++;
            }
            numeros++;
        }
    }

    public static void run(){
        primerosNPrimos(100);
    }

}
