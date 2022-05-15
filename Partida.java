package src;

public class Partida {
    int aleaNum = (int) (Math.round(Math.random() * 4));

    public void surtirPregunta() {
        Base1 primerNivel = new Base1();
        switch (aleaNum) {
            case 0:
                System.out.println("\nPREGUNTA");
                primerNivel.mostrarPregunta1();
                break;
            case 1:
                System.out.println("\nPREGUNTA");
                primerNivel.mostrarPregunta2();
                break;
            case 2:
                System.out.println("\nPREGUNTA");
                primerNivel.mostrarPregunta3();
                break;
            case 3:
                System.out.println("\nPREGUNTA");
                primerNivel.mostrarPregunta4();
                break;
            case 4:
                System.out.println("\nPREGUNTA");
                primerNivel.mostrarPregunta5();
                break;
            default:
                System.out.println("\nALGO SUCEDIÓ, VUELVE A INICIAR");
                break;
        }
    }

    public void surtirPregunta2() {
        Base2 segundoNivel = new Base2();
        switch (aleaNum) {
            case 0:
                System.out.println("\nPREGUNTA");
                segundoNivel.mostrarPregunta1();
                break;
            case 1:
                System.out.println("\nPREGUNTA");
                segundoNivel.mostrarPregunta2();
                break;
            case 2:
                System.out.println("\nPREGUNTA");
                segundoNivel.mostrarPregunta3();
                break;
            case 3:
                System.out.println("\nPREGUNTA");
                segundoNivel.mostrarPregunta4();
                break;
            case 4:
                System.out.println("\nPREGUNTA");
                segundoNivel.mostrarPregunta5();
                break;
            default:
                System.out.println("\nALGO SUCEDIÓ, VUELVE A INICIAR");
                break;
        }
    }

    public void surtirPregunta3() {
        Base3 tercerNivel = new Base3();
        switch (aleaNum) {
            case 0:
                System.out.println("\nPREGUNTA");
                tercerNivel.mostrarPregunta1();
                break;
            case 1:
                System.out.println("\nPREGUNTA");
                tercerNivel.mostrarPregunta2();
                break;
            case 2:
                System.out.println("\nPREGUNTA");
                tercerNivel.mostrarPregunta3();
                break;
            case 3:
                System.out.println("\nPREGUNTA");
                tercerNivel.mostrarPregunta4();
                break;
            case 4:
                System.out.println("\nPREGUNTA");
                tercerNivel.mostrarPregunta5();
                break;
            default:
                System.out.println("\nALGO SUCEDIÓ, VUELVE A INICIAR");
                break;
        }
    }

    public void surtirPregunta4() {
        Base4 cuartoNivel = new Base4();
        switch (aleaNum) {
            case 0:
                System.out.println("\nPREGUNTA");
                cuartoNivel.mostrarPregunta1();
                break;
            case 1:
                System.out.println("\nPREGUNTA");
                cuartoNivel.mostrarPregunta2();
                break;
            case 2:
                System.out.println("\nPREGUNTA");
                cuartoNivel.mostrarPregunta3();
                break;
            case 3:
                System.out.println("\nPREGUNTA");
                cuartoNivel.mostrarPregunta4();
                break;
            case 4:
                System.out.println("\nPREGUNTA");
                cuartoNivel.mostrarPregunta5();
                break;
            default:
                System.out.println("\nALGO SUCEDIÓ, VUELVE A INICIAR");
                break;
        }
    }

    public void surtirPregunta5() {
        Base5 quintoNivel = new Base5();
        switch (aleaNum) {
            case 0:
                System.out.println("\nPREGUNTA");
                quintoNivel.mostrarPregunta1();
                break;
            case 1:
                System.out.println("\nPREGUNTA");
                quintoNivel.mostrarPregunta2();
                break;
            case 2:
                System.out.println("\nPREGUNTA");
                quintoNivel.mostrarPregunta3();
                break;
            case 3:
                System.out.println("\nPREGUNTA");
                quintoNivel.mostrarPregunta4();
                break;
            case 4:
                System.out.println("\nPREGUNTA");
                quintoNivel.mostrarPregunta5();
                break;
            default:
                System.out.println("\nALGO SUCEDIÓ, VUELVE A INICIAR");
                break;
        }
    }
}