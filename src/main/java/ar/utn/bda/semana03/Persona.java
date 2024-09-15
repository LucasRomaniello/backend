package ar.utn.bda.semana03;

public class Persona {

    protected String nombre;

    protected String apellido;

    public Persona(){
        super();
    }

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public Persona(String nombre, String apellido) {
        this(nombre);
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
