# SofkaGame
Juego de Preguntas


Juego creado en JAVA

Por favor descargar todos los archivos y ejecutar Main (Java 11 en adelante)

25 Preguntas 
5 Niveles 
1 Respuesta correcta - 3 incorrectas

Todas las especificaciones

Se Inicia el juego ingresando nombre del Jugador y un ID autoincremental simulando la consulta a primaryKey del SQL

Se inicia con la primera ronda, preguntas de forma aleatoria de acuerdo a cada Nivel de dificultad

Si se Responde a la pregunta se puede continuar al siguiente nivel y se ejecuta la correspondiente sumatoria de puntaje

Se va acumulando el premio, si te retiras te llevas lo acumulado, si fallas pierdes todo y se reinicia.

Si llegas al final, te ganas todos los puntos posibles y el juego vuelve a iniciar en cero.

Las preguntas se distribuyen en Base1 hasta Base 5, de acuerdo a los 5 niveles de dificultad.

Clase Jugador: Contiene los atributos y métodos del Jugador que permiten su identificación y asignación de puntaje.
Clase Pregunta: Contiene atributos y métodos estáticos para la correcta manipulación de los comportamientos de las preguntas y respuestas de acuerdo a las interacciones del Jugador.
Clase Partida: contiene el método random para la aleatoriedad de las preguntas en cada partida.
Clase inicio: Permite el inicio y el reinicio en ceros cada vez que se deba instanciar de acuerdo a las interacciones del Jugador.
