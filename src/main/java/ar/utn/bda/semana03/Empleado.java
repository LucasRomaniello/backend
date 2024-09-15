package ar.utn.bda.semana03;

public class Empleado extends Persona{

    private double salario;

    public Empleado(String nombre, String apellido, double salario){
        super(nombre, apellido);
        this.salario = salario;
    }

    public String toString(){
        return String.format("%s, %s, %.2f", nombre, apellido, salario);
    }

    public static void main(String[] args) {
        Empleado e = new Empleado("Lucas", "Apellido", 999.99);

        System.out.println(e);
    }

}
