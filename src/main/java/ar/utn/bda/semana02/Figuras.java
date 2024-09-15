package ar.utn.bda.semana02;

import static ar.utn.bda.util.MathUtil.isEven;

public class Figuras {

    static final char e = ' ';
    static final char a = '*';

    private static void figura1(){
        for (int i = 1; i < 25; i++) {
            System.out.print(a);
            System.out.print(e);
            if (i % 6 == 0) System.out.println();
        }
    }

    private static void figura2(){
        int fila = 1;
        for (int i = 1; i <= 4; i++) {
            if (isEven(fila)){
                for (int j = 0; j < 6; j++) {
                    System.out.print(a);
                    System.out.print(e);
                }
            }else {
                for (int j = 0; j < 6; j++) {
                    System.out.print(e);
                    System.out.print(a);
                }
            }
            System.out.println();
            fila++;
        }
    }

    public static void figura3(){
        int fila = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < fila; j++) {
                System.out.print(a);
                System.out.print(e);
            }
            System.out.println();
            fila++;
        }
    }

    public static void figura4(){
        figura3();
        int fila = 4;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= fila; j++) {
                System.out.print(a);
                System.out.print(e);
            }
            System.out.println();
            fila--;
        }
    }

    public static void run(){
        System.out.println("Figura 1.");
        figura1();
        System.out.println("Figura 2.");
        figura2();
        System.out.println("Figura 3.");
        figura3();
        System.out.println("Figura 4.");
        figura4();
    }

    public static void main(String[] args) {
        run();
    }

}
