package ar.utn.bda;

import ar.utn.bda.semana02.Figuras;
import ar.utn.bda.semana02.ISBN;
import ar.utn.bda.semana02.NPrimos;

import java.util.Scanner;

import static ar.utn.bda.semana02.NPrimos.primerosNPrimos;
import static ar.utn.bda.util.MathUtil.isPrime;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int numero = sc.nextInt();

        System.out.println(numero);

        Figuras.run();
        NPrimos.run();
        ISBN.run();
    }
}