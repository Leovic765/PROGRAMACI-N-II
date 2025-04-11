package videojuego;

public class Videojuego {
private String nombre;
private String plataforma;
private int cantidadJugadores;

public Videojuego(String nombre, String plataforma) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = 1;
}

public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
    this.nombre = nombre;
    this.plataforma = plataforma;
    this.cantidadJugadores = cantidadJugadores;
}
public void mostrar() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Plataforma: " + plataforma);
    System.out.println("Cantidad de jugadores: " + cantidadJugadores);
}
public void agregarJugadores() {
    cantidadJugadores += 1;
}
public void agregarJugadores(int n) {
    if (n > 0) {
        cantidadJugadores += n;
        }
}
public static void main(String[] args) {
        Videojuego v1 = new Videojuego("Minecraft", "PC", 5);
        Videojuego v2 = new Videojuego("Mario Kart 8", "Nintendo Switch");

        v1.mostrar();
        v2.mostrar();

        v1.agregarJugadores();       
        v2.agregarJugadores(3);      

        //Estado actualizado
        v1.mostrar();
        v2.mostrar();
    }
    
}
