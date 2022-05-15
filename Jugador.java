package src;
import java.util.Scanner;

public class Jugador {

    // Atributos del Jugador
    static int idJugador = 0; // autoincrementado
    String nombre;
    static int puntaje;

    // Metodos del Jugador
    public void tomarNombre() {
        System.out.println("Hola Jugador! ¿Cúal es tu nombre?");
        Scanner sc = new Scanner(System.in);
        nombre = String.valueOf(sc.nextLine());
        idJugador++;
    }

    public void mostrarNombre() {
        System.out.println("\nBienvenido a este Juego de conocimiento " + "\n\nTu nombre de jugador sera:  " + nombre
                + " " + idJugador + "\n");
        System.out.println("Puntaje inicial: " + puntaje);
    }

    public static void sumarPuntos() {
        puntaje += 20;
        System.out.println("CORRECTO! HAS REUNIDO " + puntaje + "PUNTOS");
    }

    public static void salePuntos() {
        System.out.println("GRACIAS POR PARTICIPAR, HAS LOGRADO " + puntaje + "PUNTOS\n\n");
    }

    public static void reiniciaPuntos() {
        puntaje =  0;
    }

    public static void fin() {
        System.out.println("LO HAS LOGRADO! PASASTE TODOS LOS NIVELES! OBTIENES EL MAXIMO PUNTAJE!!!\nPUNTAJE FINAL: 100 PUNTOS!!!\n\n\n");
    }
}
