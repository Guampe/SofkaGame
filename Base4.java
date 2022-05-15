package src;

public class Base4 {
    public void mostrarPregunta1() {
        Pregunta.pregunta(
                "¿La ballena que tipo de animal es?\n\nPon 1 para INVERTEBRADO\nPon 2 para MAMIFERO\nPon 3 para VEGETARIANO\nPon 4 para AEREO\n\nPON CERO PARA SALIR Y CONSERVR TUS PUNTOS\n");
        Pregunta.tomaRespuesta();

        if (Pregunta.respuesta == 0) {
            Jugador.salePuntos();
            Inicio.iniciando();
        } else if (Pregunta.respuesta == 2) {
            Jugador.sumarPuntos();
            Partida surte2 = new Partida();
            surte2.surtirPregunta5();
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
                "¿Por cultivar que producto es conocido Guatemala?\n\nPon 1 para PERAS\nPon 2 para COCOS\nPon 3 para ARROZ\nPon 4 para CAFE\n\nPON CERO PARA SALIR Y CONSERVAR TUS PUNTOS\n");
        Pregunta.tomaRespuesta();

        if (Pregunta.respuesta == 0) {
            Jugador.salePuntos();
            Inicio.iniciando();
        } else if (Pregunta.respuesta == 4) {
            Jugador.sumarPuntos();
            Partida surte2 = new Partida();
            surte2.surtirPregunta5();
        } else if (Pregunta.respuesta == 2 || Pregunta.respuesta == 1 || Pregunta.respuesta == 3) {
            Pregunta.error();
            Inicio.iniciando();
        } else {
            Pregunta.invalido();
            Inicio.iniciando();
        }
    }

    public void mostrarPregunta3() {
        Pregunta.pregunta(
                "¿En qué ano comenzo la II Guerra Mundial?\n\nPon 1 para 1998\nPon 2 para 1939\nPon 3 para 1820\nPon 4 para 1974\n\nPON CERO PARA SALIR Y CONSERVAR TUS PUNTOS\n");
        Pregunta.tomaRespuesta();

        if (Pregunta.respuesta == 0) {
            Jugador.salePuntos();
            Inicio.iniciando();
        } else if (Pregunta.respuesta == 2) {
            Jugador.sumarPuntos();
            Partida surte2 = new Partida();
            surte2.surtirPregunta5();
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
                "¿Cual es la capital de Suecia?\n\nPon 1 para ESTOCOLMO\nPon 2 para GRECIA\nPon 3 para KIEV\nPon 4 para NUAK\n\nPON CERO PARA SALIR Y CONSERVAR TUS PUNTOS\n");
        Pregunta.tomaRespuesta();

        if (Pregunta.respuesta == 0) {
            Jugador.salePuntos();
            Inicio.iniciando();
        } else if (Pregunta.respuesta == 1) {
            Jugador.sumarPuntos();
            Partida surte2 = new Partida();
            surte2.surtirPregunta5();
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
                "¿En que pais se encuentra la Universidad de Standford?\n\nPon 1 para INGLATERRA\nPon 2 para RUSIA\nPon 3 para CHILE\nPon 4 para USA\n\nPON CERO PARA SALIR Y CONSERVAR TUS PUNTOS\n");
        Pregunta.tomaRespuesta();

        if (Pregunta.respuesta == 0) {
            Jugador.salePuntos();
            Inicio.iniciando();
        } else if (Pregunta.respuesta == 4) {
            Jugador.sumarPuntos();
            Partida surte2 = new Partida();
            surte2.surtirPregunta5();
        } else if (Pregunta.respuesta == 1 || Pregunta.respuesta == 2 || Pregunta.respuesta == 3) {
            Pregunta.error();
            Inicio.iniciando();
        } else {
            Pregunta.invalido();
            Inicio.iniciando();
        }
    }

}