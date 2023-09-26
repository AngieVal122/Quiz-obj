

public class Animal {
    String nombre;
    int edad;
    String raza;
    Animal (String nombre, int edad) {
        this.nombre= nombre;
        this.edad = edad;

    }
    void mensaje () {
        System.out.println(" El " +nombre + " Tiene " + edad + " años ");
    }
}