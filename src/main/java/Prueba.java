public class Prueba {
    String nombre;
    int edad;

    public Prueba() {
        nombre = "Jorge";
        edad = 19;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int anyFly() {
        return edad*10;
    }

}
