package src;

public class Base5 {

    public void mostrarPregunta1() {
        Pregunta.pregunta(
                "¿Cual es la moneda Marruecos?\n\nPon 1 para MARRO\nPon 2 para DIRHAM\nPon 3 para ROKO\nPon 4 para KRON\n\nPON CERO PARA SALIR Y CONSERVR TUS PUNTOS\n");
        Pregunta.tomaRespuesta();

        if (Pregunta.respuesta == 0) {
            Jugador.salePuntos();
            Inicio.iniciando(); 
        } else if (Pregunta.respuesta == 2) {
            Jugador.fin();
            Inicio.iniciando();      
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
                "¿Como se llama la capital de Mongolia?\n\nPon 1 para BRODO\nPon 2 para RONOTA\nPon 3 para HUN DANH\nPon 4 para ULAN BATOR\n\nPON CERO PARA SALIR Y CONSERVAR TUS PUNTOS\n");
        Pregunta.tomaRespuesta();

        if (Pregunta.respuesta == 0) {
            Jugador.salePuntos();
            Inicio.iniciando(); 
        } else if (Pregunta.respuesta == 4) {
            Jugador.fin();
            Inicio.iniciando();         
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
                "¿Cual es quinto planeta en el sistema solar?\n\nPon 1 para MARTE\nPon 2 para JUPITER\nPon 3 para VENUS\nPon 4 para URANO\n\nPON CERO PARA SALIR Y CONSERVAR TUS PUNTOS\n");
        Pregunta.tomaRespuesta();

        if (Pregunta.respuesta == 0) {
            Jugador.salePuntos();
            Inicio.iniciando();
        } else if (Pregunta.respuesta == 2) {
            Jugador.fin();
            Inicio.iniciando();    
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
                "¿Cual es la capital de Kosovo?\n\nPon 1 para YUN\nPon 2 para PRISTINA\nPon 3 para KIEV\nPon 4 para KENWOR\n\nPON CERO PARA SALIR Y CONSERVAR TUS PUNTOS\n");
        Pregunta.tomaRespuesta();

        if (Pregunta.respuesta == 0) {
            Jugador.salePuntos();
            Inicio.iniciando();
        } else if (Pregunta.respuesta == 2) {
            Jugador.fin();
            Inicio.iniciando(); 
        } else if (Pregunta.respuesta == 4 || Pregunta.respuesta == 1 || Pregunta.respuesta == 3) {
            Pregunta.error();
            Inicio.iniciando();
        } else {
            Pregunta.invalido();
            Inicio.iniciando();
        }
    }

    public void mostrarPregunta5() {
        Pregunta.pregunta(
                "¿Cuál es el metal más caro del mundo?\n\nPon 1 para ORO\nPon 2 para PLATA\nPon 3 para PLATINO\nPon 4 para RODIO\n\nPON CERO PARA SALIR Y CONSERVAR TUS PUNTOS\n");
        Pregunta.tomaRespuesta();

        if (Pregunta.respuesta == 0) {
            Jugador.salePuntos();
            Inicio.iniciando();
        } else if (Pregunta.respuesta == 4) {
            Jugador.fin();
            Inicio.iniciando();      
        } else if (Pregunta.respuesta == 2 || Pregunta.respuesta == 1 || Pregunta.respuesta == 3) {
            Pregunta.error();
            Inicio.iniciando();
        } else {
            Pregunta.invalido();
            Inicio.iniciando();
        }
    }
}