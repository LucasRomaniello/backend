package ar.utn.bda.semana02;

import ar.utn.bda.Main;

public class ISBN {

    public static void run(){
        String cod = "0-306-40615-2";

        int cantidad = 10;
        int resultado = 0;
        for(char caracter : cod.toCharArray()){
            if (Character.isDigit(caracter)){
                resultado += caracter * cantidad;
                cantidad--;
            }
        }
        if (resultado % 11 == 0) System.out.println("Válido." + cod);
        else System.out.println("No válido. " + cod);
    }

    public static void main(String[] args) {
        String e2 = "84-8181-227-7";
        String e3 = "84-8181-227-1";
        String e4 = "1-55615-507-7";
        String e5 = "1-55615-507-9";
        String e6 = "950-07-2749-8";
    }

}
