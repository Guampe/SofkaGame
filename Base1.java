package src;
public class Base1 {

    public void mostrarPregunta1() {
        Pregunta.pregunta(
                "¿De que se alimentan los Koalas?\n\nPon 1 para NARANJAS\nPon 2 para MOSQUITOS\nPon 3 para HOJAS DE EUCALIPTO\nPon 4 para PECES\n\nPON CERO PARA SALIR\n");
        Pregunta.tomaRespuesta();

        if (Pregunta.respuesta == 0) {
            Pregunta.cero();
            Inicio.iniciando();
        } else if (Pregunta.respuesta == 3) {
            Jugador.sumarPuntos();
            Partida surte2 = new Partida();
            surte2.surtirPregunta2();
        } else if (Pregunta.respuesta == 1 || Pregunta.respuesta == 2 || Pregunta.respuesta == 4) {
            Pregunta.error();
            Inicio.iniciando();
        } else {
            Pregunta.invalido();
            Inicio.iniciando();
        }
    }

    public void mostrarPregunta2() {
        Pregunta.pregunta(
                "¿Quien invento el telescopio?\n\nPon 1 para JBalvin\nPon 2 para HANS LIPPERSHEY\nPon 3 para RICHARD HOOB\nPon 4 para TEOFILO GUTIERREZ\n\nPON CERO PARA SALIR\n");
        Pregunta.tomaRespuesta();

        if (Pregunta.respuesta == 0) {
            Pregunta.cero();
            Inicio.iniciando();
        } else if (Pregunta.respuesta == 2) {
            Jugador.sumarPuntos();
            Partida surte2 = new Partida();
            surte2.surtirPregunta2();
        } else if (Pregunta.respuesta == 1 || Pregunta.respuesta == 3 || Pregunta.respuesta == 4) {
            Pregunta.error();
            Inicio.iniciando();
        } else {
            Pregunta.invalido();
            Inicio.iniciando();
        }
    }

    public void mostrarPregunta3() {
        Pregunta.pregunta(
                "¿Cual fue la primera pelicula de Walt Disney?\n\nPon 1 para RAPUNSEL\nPon 2 para RAPIDOS Y FURIOSOS\nPon 3 para SPIDERMAN\nPon 4 para BLANCA NIEVES\n\nPON CERO PARA SALIR\n");
        Pregunta.tomaRespuesta();

        if (Pregunta.respuesta == 0) {
            Pregunta.cero();
            Inicio.iniciando();
        } else if (Pregunta.respuesta == 4) {
            Jugador.sumarPuntos();
            Partida surte2 = new Partida();
            surte2.surtirPregunta2();
        } else if (Pregunta.respuesta == 1 || Pregunta.respuesta == 2 || Pregunta.respuesta == 3) {
            Pregunta.error();
            Inicio.iniciando();
        } else {
            Pregunta.invalido();
            Inicio.iniciando();
        }
    }

    public void mostrarPregunta4() {
        Pregunta.pregunta(
                "¿Quien escribio La Odisea?\n\nPon 1 para HOMERO\nPon 2 para GABO\nPon 3 para BART\nPon 4 para JOSE CASAS\n\nPON CERO PARA SALIR\n");
        Pregunta.tomaRespuesta();

        if (Pregunta.respuesta == 0) {
            Pregunta.cero();
            Inicio.iniciando();
        } else if (Pregunta.respuesta == 1) {
            Jugador.sumarPuntos();
            Partida surte2 = new Partida();
            surte2.surtirPregunta2();
        } else if (Pregunta.respuesta == 2 || Pregunta.respuesta == 3 || Pregunta.respuesta == 4) {
            Pregunta.error();
            Inicio.iniciando();
        } else {
            Pregunta.invalido();
            Inicio.iniciando();
        }
    }

    public void mostrarPregunta5() {
        Pregunta.pregunta(
                "¿Quien pinto La última cena?\n\nPon 1 para LEONARDO DA VINCI\nPon 2 para TERESA VIDAL\nPon 3 para BOTERO\nPon 4 para PICASSO\n\nPON CERO PARA SALIR\n");
        Pregunta.tomaRespuesta();

        if (Pregunta.respuesta == 0) {
            Pregunta.cero();
            Inicio.iniciando();
        } else if (Pregunta.respuesta == 1) {
            Jugador.sumarPuntos();
            Partida surte2 = new Partida();
            surte2.surtirPregunta2();
        } else if (Pregunta.respuesta == 2 || Pregunta.respuesta == 3 || Pregunta.respuesta == 4) {
            Pregunta.error();
            Inicio.iniciando();
        } else {
            Pregunta.invalido();
            Inicio.iniciando();
        }
    }
}
