package src;

public class Inicio {

    public static void iniciando() {
    
        Jugador.reiniciaPuntos();

        Jugador nuevoJugador = new Jugador();
        nuevoJugador.tomarNombre();
        nuevoJugador.mostrarNombre();
    
        Partida surte = new Partida();
        surte.surtirPregunta();

    }

}
