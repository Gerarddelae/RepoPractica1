public class Estudiante {
protected String nombre;
protected String apellido;
protected int edad;

public Estudiante(String nombre, String apellido, int edad) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
}

public void mostrarDatos() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Apellido: " + apellido);
    System.out.println("Edad: " + edad);
}

}
