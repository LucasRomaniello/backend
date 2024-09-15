package ar.utn.bda;

import ar.utn.bda.semana02.Figuras;
import ar.utn.bda.semana02.ISBN;
import ar.utn.bda.semana02.NPrimos;
import ar.utn.bda.semana03.Persona;

import java.util.Scanner;

import static ar.utn.bda.semana02.NPrimos.primerosNPrimos;
import static ar.utn.bda.util.MathUtil.isPrime;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        /*
        int numero = -1;

        while (numero != 4){
            System.out.println("Menú");
            System.out.println("1. Figuras");
            System.out.println("2. ISBN ");
            System.out.println("3. NPRimos");
            System.out.println("4. salir");
            System.out.print("Ingrese una opcion: ");

        try{
            numero = sc.nextInt();}
        catch(Exception e){
            sc = new Scanner(System.in);
            numero = 0;
        };

        switch (numero){
            case 1:
                Figuras.run();
                break;
            case 2:
                ISBN.run();
                break;
            case 3:
                NPrimos.run();
                break;
            case 4:
                System.out.println("Hasta luego.");
                break;
            default:
                System.out.println("Se debe ingresar un número entre 1 y 4.");
        }
        } */

        sc.close();

    }
}