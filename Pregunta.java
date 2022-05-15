package src;
import java.util.Scanner;

public class Pregunta {

    static String cuerpo;
    static int respuesta;

    public static void tomaRespuesta() {
        Scanner sc = new Scanner(System.in);
        respuesta = Integer.valueOf(sc.nextLine());
    }

    public static void pregunta(String cuerpo) {
        System.out.println(cuerpo);
    }

    public static void error() {
        System.out.println("FALLASTE!");
        System.out.println("PUNTAJE TOTAL = 0\n\n");
    }

    public static void invalido() {
        System.out.println("Selecciona una opcion valida\n\n");
    }

    public static void cero() {
        System.out.println("GRACIAS POR PARTICIPAR!\n\n");
    }
}
