import java.util.*;
public class Alumno{
    private int cuenta;
    private String nombre;
    private String apellido;
    public Alumno(){};
    public Alumno(String nombre,String apellido,int cuenta){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setCuenta(cuenta);
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
    
    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
    public void verDatos(){
        System.out.println("Alumno:  "+nombre+" "+apellido+" Numero de cuenta: "+cuenta);
    }
}