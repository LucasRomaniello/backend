package ar.utn.bda.semana03.EstVsDin;

public class Derivada extends Base{

    @Override
    public void f(){
        System.out.println("Derivada.");
    }

    public static void main(String[] args) {
        Base b = new Base();
        Derivada d = new Derivada();


        b.f();
        d.f();
        ((Base)d).f();

        b = d;
        b.f();

    }

}
