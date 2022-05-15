package src;
public class Base3 {

    public void mostrarPregunta1() {
        Pregunta.pregunta(
                "¿Ciudad mas poblada mundo?\n\nPon 1 para BOGOTÁ\nPon 2 para TOKIO\nPon 3 para PARIS\nPon 4 para HON KONG\n\nPON CERO PARA SALIR Y CONSERVR TUS PUNTOS\n");
        Pregunta.tomaRespuesta();

        if (Pregunta.respuesta == 0) {
            Jugador.salePuntos();
            Inicio.iniciando();
        } else if (Pregunta.respuesta == 2) {
            Jugador.sumarPuntos();
            Partida surte2 = new Partida();
            surte2.surtirPregunta4();
        } else if (Pregunta.respuesta == 4 || Pregunta.respuesta == 1 || Pregunta.respuesta == 3) {
            Pregunta.error();
            Inicio.iniciando();
        } else {
            Pregunta.invalido();
            Inicio.iniciando();
        }
    }

    public void mostrarPregunta2() {
        Pregunta.pregunta(
                "¿Cantidad de huesos en el cuerpo humano?\n\nPon 1 para 176\nPon 2 para 728\nPon 3 para 108\nPon 4 para 206\n\nPON CERO PARA SALIR Y CONSERVAR TUS PUNTOS\n");
        Pregunta.tomaRespuesta();

        if (Pregunta.respuesta == 0) {
            Jugador.salePuntos();
            Inicio.iniciando();
        } else if (Pregunta.respuesta == 4) {
            Jugador.sumarPuntos();
            Partida surte2 = new Partida();
            surte2.surtirPregunta4();
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
                "¿En que continente esta Republica de Kazajistá?\n\nPon 1 para ASIA\nPon 2 para ASIA Y EUROPA\nPon 3 para EUROPA\nPon 4 para AFRICA\n\nPON CERO PARA SALIR Y CONSERVAR TUS PUNTOS\n");
        Pregunta.tomaRespuesta();

        if (Pregunta.respuesta == 0) {
            Jugador.salePuntos();
            Inicio.iniciando();
        } else if (Pregunta.respuesta == 2) {
            Jugador.sumarPuntos();
            Partida surte2 = new Partida();
            surte2.surtirPregunta4();
        } else if (Pregunta.respuesta == 4 || Pregunta.respuesta == 1 || Pregunta.respuesta == 3) {
            Pregunta.error();
            Inicio.iniciando();
        } else {
            Pregunta.invalido();
            Inicio.iniciando();
        }
    }

    public void mostrarPregunta4() {
        Pregunta.pregunta(
                "¿De donde son originarios juegos olimpicos?\n\nPon 1 para GRECIA\nPon 2 para ROMA\nPon 3 para PARIS\nPon 4 para JAPON\n\nPON CERO PARA SALIR Y CONSERVAR TUS PUNTOS\n");
        Pregunta.tomaRespuesta();

        if (Pregunta.respuesta == 0) {
            Jugador.salePuntos();
            Inicio.iniciando();
        } else if (Pregunta.respuesta == 1) {
            Jugador.sumarPuntos();
            Partida surte2 = new Partida();
            surte2.surtirPregunta4();
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
                "¿Cual es el rio mas largo del mundo?\n\nPon 1 para NILO\nPon 2 para AMAZONAS\nPon 3 para MISSISIPI\nPon 4 para CALI\n\nPON CERO PARA SALIR Y CONSERVAR TUS PUNTOS\n");
        Pregunta.tomaRespuesta();

        if (Pregunta.respuesta == 0) {
            Jugador.salePuntos();
            Inicio.iniciando();
        } else if (Pregunta.respuesta == 1) {
            Jugador.sumarPuntos();
            Partida surte2 = new Partida();
            surte2.surtirPregunta4();
        } else if (Pregunta.respuesta == 4 || Pregunta.respuesta == 2 || Pregunta.respuesta == 3) {
            Pregunta.error();
            Inicio.iniciando();
        } else {
            Pregunta.invalido();
            Inicio.iniciando();
        }
    }
}
