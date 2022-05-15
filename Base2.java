package src;
public class Base2 {

    public void mostrarPregunta1() {
        Pregunta.pregunta(
                "¿Cual es el oceano mas grande?\n\nPon 1 para MARITIMO\nPon 2 para PACIFICO\nPon 3 para ATLANTICO\nPon 4 para INDICO\n\nPON CERO PARA SALIR Y CONSERVARE TUS PUNTOS\n");
        Pregunta.tomaRespuesta();

        if (Pregunta.respuesta == 0) {
            Jugador.salePuntos();
            Inicio.iniciando();
        } else if (Pregunta.respuesta == 2) {
            Jugador.sumarPuntos();
            Partida surte2 = new Partida();
            surte2.surtirPregunta3();
        } else if (Pregunta.respuesta == 1 || Pregunta.respuesta == 3 || Pregunta.respuesta == 4) {
            Pregunta.error();
            Inicio.iniciando();
        } else {
            Pregunta.invalido();
            Inicio.iniciando();
        }
    }

    public void mostrarPregunta2() {
        Pregunta.pregunta(
                "¿Cual es el pais mas grande del mundo?\n\nPon 1 para CHINA\nPon 2 para INDIA\nPon 3 para USA\nPon 4 para RUSIA\n\nPON CERO PARA SALIR Y CONSERVAR TUS PUNTOS\n");
        Pregunta.tomaRespuesta();

        if (Pregunta.respuesta == 0) {
            Jugador.salePuntos();
            Inicio.iniciando();
        } else if (Pregunta.respuesta == 4) {
            Jugador.sumarPuntos();
            Partida surte2 = new Partida();
            surte2.surtirPregunta3();
        } else if (Pregunta.respuesta == 1 || Pregunta.respuesta == 2 || Pregunta.respuesta == 3) {
            Pregunta.error();
            Inicio.iniciando();
        } else {
            Pregunta.invalido();
            Inicio.iniciando();
        }
    }

    public void mostrarPregunta3() {
        Pregunta.pregunta(
                "¿Cual es pais mas poblado de la Tierra?\n\nPon 1 para INDIA\nPon 2 para CHINA\nPon 3 para COLOMBIA\nPon 4 para RUSIA\n\nPON CERO PARA SALIR Y CONSERVAR TUS PUNTOS\n");
        Pregunta.tomaRespuesta();

        if (Pregunta.respuesta == 0) {
            Jugador.salePuntos();
            Inicio.iniciando();
        } else if (Pregunta.respuesta == 2) {
            Jugador.sumarPuntos();
            Partida surte2 = new Partida();
            surte2.surtirPregunta3();
        } else if (Pregunta.respuesta == 1 || Pregunta.respuesta == 3 || Pregunta.respuesta == 4) {
            Pregunta.error();
            Inicio.iniciando();
        } else {
            Pregunta.invalido();
            Inicio.iniciando();
        }
    }

    public void mostrarPregunta4() {
        Pregunta.pregunta(
                "¿En que ciudad se uso la primera bomba atomica en combate?\n\nPon 1 para HIROSHIMA\nPon 2 para RUSIA\nPon 3 para BOSTON\nPon 4 para KIEV\n\nPON CERO PARA SALIR Y CONSERVAR TUS PUNTOS\n");
        Pregunta.tomaRespuesta();

        if (Pregunta.respuesta == 0) {
            Jugador.salePuntos();
            Inicio.iniciando();
        } else if (Pregunta.respuesta == 1) {
            Jugador.sumarPuntos();
            Partida surte2 = new Partida();
            surte2.surtirPregunta3();
        } else if (Pregunta.respuesta == 4 || Pregunta.respuesta == 2 || Pregunta.respuesta == 3) {
            Pregunta.error();
            Inicio.iniciando();
        } else {
            Pregunta.invalido();
            Inicio.iniciando();
        }
    }

    public void mostrarPregunta5() {
        Pregunta.pregunta(
                "¿Que es mas grande, un atomo o una celula?\n\nPon 1 para CELULA\nPon 2 para ATOMO\nPon 3 para IGUALES\nPon 4 para PROTON\n\nPON CERO PARA SALIR Y CONSERVAR TUS PUNTOS\n");
        Pregunta.tomaRespuesta();

        if (Pregunta.respuesta == 0) {
            Jugador.salePuntos();
            Inicio.iniciando();
        } else if (Pregunta.respuesta == 1) {
            Jugador.sumarPuntos();
            Partida surte2 = new Partida();
            surte2.surtirPregunta3();
        } else if (Pregunta.respuesta == 4 || Pregunta.respuesta == 2 || Pregunta.respuesta == 3) {
            Pregunta.error();
            Inicio.iniciando();
        } else {
            Pregunta.invalido();
            Inicio.iniciando();
        }
    }
}
