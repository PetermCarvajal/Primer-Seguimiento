package QuintoPunto;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Explique que son los Datos Primitivos en Java. Y haga 3 ejemplos de cada uno de los tipos, mostrando " +
                "su salida por la consola.");
        System.out.print("Los Tipos de Datos Primitivos es un tipo de dato básico, Son usados en función del tamaño de Número que se neceista, Pero las  Letras  " +
                "Solo se puede usar de a 1 Letra \n Pués de lo contrario se convierte en un  Tipo de dato De Referencia \\n\\n Los datos Primitivos se Dividen en 4 y son: \\n\" +\n" +
                "                \" Booleanos=Falso o Verdadero;Character = esto simboliza que recibe un único Caracter/letra/digito;Integer:Este se subdivide en 4 Los  cuales son  byte,short,int,long;" +
                "Float=Flotante /Decimales. Este se Subdivide en 2:float y double \n Para estos Ejemplos se usaran Booleanos Caracter y Enteros\n\n\n\n");

        JOptionPane.showMessageDialog(null, "Buenos Días Por favor digiete el número del tipo de dato que queire ver Ejemplo \n 1. Booleanos \n 2. Character \n 3. Integer \n 4.Float");
        Scanner selector = new Scanner(System.in);
        int selector1 = selector.nextInt();

        if (selector1 < 1 || selector1 > 4) {
            JOptionPane.showMessageDialog(null, "Por favor Ingrese un Número valido");
        }
        if (selector1 >= 1 || selector1 <= 4) {

            switch (selector1) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Usted a Elejido Booleanos Por Favor Ingrese el Número del Ejemplo que Quiere ver \n 1. Edad \n 2. Acceso \n 3. Contraseña");
                    Scanner selector2 = new Scanner(System.in);
                    int selector3 = selector2.nextInt();
                    if (selector3 < 1 || selector3 > 3) {
                        JOptionPane.showMessageDialog(null, "Por Favor Digite un Número Correcto");
                    }
                    if (selector3 >= 1 || selector3 <= 3) {
                        switch (selector3) {

                            case 1:
                                JOptionPane.showMessageDialog(null, "Ejemplo 1 Por Favor Ingrese Su Edad");
                                Scanner Ingreso = new Scanner(System.in);
                                int Edad = Ingreso.nextInt();
                                boolean pasa = true;
                                if (Edad < 18) {
                                    pasa = false;
                                    JOptionPane.showMessageDialog(null, pasa + " Usted es menor de Edad");

                                } else if (Edad >= 18) {
                                    JOptionPane.showMessageDialog(null, pasa + " Usted es un Adulto Joven Bienvenido");
                                }
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Ejemplo 2  Acceso Por Favor Ingrese Su Nombre");
                                Scanner nombre = new Scanner(System.in);
                                String acceso = nombre.nextLine();
                                boolean pasa2 = true;
                                switch (acceso) {
                                    case "Arle":
                                        JOptionPane.showMessageDialog(null, pasa2 + " Bienvenido Profesor Arle Morales");
                                        break;
                                    case "Peter":
                                        JOptionPane.showMessageDialog(null, pasa2 + "Bienvenido Peter ¿Qué vamos a Programar Hoy?");
                                        break;
                                    default:
                                        pasa2 = false;
                                        JOptionPane.showMessageDialog(null, pasa2 + " Usted No Tiene Acceso a Este Sistema");
                                        break;
                                }
                            case 3:
                                Scanner entrada = new Scanner(System.in);
                                JOptionPane.showMessageDialog(null, "Confirmo de Contraseña");
                                String passAnterior = null;
                                boolean valido = false;
                                while (true) {
                                    JOptionPane.showMessageDialog(null, "Confirmación de Contraseña");
                                    String pass = JOptionPane.showInputDialog("Ingrese la contraseña:");

                                    if (passAnterior == null) {
                                        passAnterior = pass;
                                        valido = true;
                                        System.out.println("Primera contraseña guardada.");
                                    } else {
                                        valido = pass.equals(passAnterior);
                                        System.out.println("Contraseña válida: " + valido);
                                    }

                                    if (!valido) {
                                        break;// Empiezo a creer que me estoy complicando mucho la vida con este (5E Ejercicio)
                                    }
                                    break;
                                }
                        }


                    }
                case 2:
                    //Este Decia "Por Consola" Así que lo seguire por consola para mas facilidad Y Rapidez
                    JOptionPane.showMessageDialog(null,"Usted ha Elegido Characters Por Favor Digite el Número del Ejemplo. \n 1. Index \n 2. proximamente \n 3. ");
                    Scanner selector4 = new Scanner(System.in);
                    int selector5 = selector4.nextInt();
                    if(selector5<1||selector5>3){
                        JOptionPane.showMessageDialog( null,"Por Favor Digite un Número Correcto");
                    }
                    if(selector5>=1||selector5<=3) {
                        switch (selector5) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Por Favor Digite Algo");
                                System.out.print("");
                                Scanner cadena = new Scanner(System.in);
                                String lineaCadena = cadena.nextLine();
                                char primerCaracter = lineaCadena.charAt(0);
                                JOptionPane.showMessageDialog(null, "La Primera Letra es: " + primerCaracter);
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Este es un Ejemplo de que es un Caracter. \n Para el siguiente caracter Se necesita una combinacion  total de 8 Teclas y Aún Así Cuenta con solo 1 espacio.");
                                JOptionPane.showMessageDialog(null, "\u058D Este  ");
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Bueno y ahora un poco de arte");
                                char[][] gato = {
                                        {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                        {' ', ' ', '#', ' ', ' ', '#', ' ', ' '},
                                        {' ', ' ', '#', '#', '#', '#', ' ', ' '},
                                        {' ', '#', '#', '#', '#', '#', '#', ' '},
                                        {' ', ' ', '#', '#', '#', '#', ' ', ' '},
                                        {' ', ' ', '/', ' ', '\\', ' ', ' ', ' '},
                                        {' ', ' ', '/', ' ', '\\', ' ', ' ', ' '},
                                        {' ', ' ', '/', ' ', '\\', ' ', ' ', ' '}
                                };
                                for (char[] fila : gato) {
                                    for (char c : fila) {
                                        System.out.print(c);
                                    }
                                    System.out.println();
                                }
                                break;
                        }
                    }
                case 3:
                    JOptionPane.showMessageDialog(null,"Usted ha Elegido Integer Calcula el Area de:\n");
                    System.out.print("Elija el Ejemplo que desea Ver \n 1. Cuadrado \n 2. Triangulo \n 3. Rectangulo");
                    Scanner selector6 = new Scanner(System.in);
                    int selector7 = selector6.nextInt();
                    if(selector7<1||selector7>3){
                        JOptionPane.showMessageDialog(null,"Por favor digite un Número valido");
                    }
                    if(selector7>=1||selector7<=3){
                        switch (selector7) {
                            case 1:
                                JOptionPane.showMessageDialog(null,"Ingrese los Lados del Cuadrado\n");
                                System.out.print("Lado 1");
                                Scanner Lado = new Scanner(System.in);
                                int Lado1 = Lado.nextInt();
                                int Area=Lado1*Lado1;
                                JOptionPane.showMessageDialog(null,"el Area del Cuadrado es de "+ Area);
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null,"Ingrese el primer lado del Triangulo");
                               System.out.print("Ingrese las medidas del primer lado");
                               Scanner Lado2 = new Scanner(System.in);
                               int Lado3 = Lado2.nextInt();
                               System.out.print("Ingrese las medidas del Lado 2");
                               Scanner Lado4 = new Scanner(System.in);
                               int Lado5 = Lado4.nextInt();
                               int AreaTri=(Lado3^2)+(Lado5^2);
                               JOptionPane.showMessageDialog(null,"el Area del Triangulo es "+ AreaTri);
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null,"Ingrese el Primer lado del rectangulo");
                                System.out.print("Lado 1 de 4 ");
                                Scanner Rec1 = new Scanner(System.in);
                                int lad1 = Rec1.nextInt();
                                System.out.print("Lado 2 de 4 ");
                                Scanner Rec2 = new Scanner(System.in);
                                int lad2 = Rec2.nextInt();
                                System.out.print("Lado 3 de 4 ");
                                Scanner Rec3 = new Scanner(System.in);
                                int lad3 = Rec3.nextInt();
                                System.out.print("Lado 4 de 4 ");
                                Scanner Rec4 = new Scanner(System.in);
                                int lad4 = Rec4.nextInt();
                                int AreaRec=lad1+lad2+lad3+lad4;
                                JOptionPane.showMessageDialog(null,"el Area del rectangulo es "+ AreaRec);
                                break;
                        }
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"Usted a Elegido Float");
                    System.out.print("Por Favor Elija  el Número del Ejemplo \n 1. \n 2. \n 3.");
                    Scanner selector8 = new Scanner(System.in);
                    int selector9 = selector8.nextInt();
                    if(selector9<1||selector9>3){
                        JOptionPane.showMessageDialog(null,"Por favor Ingrese un Numero Valido");
                    }
                    if(selector9>=1||selector9<=3){
                        switch (selector9) {
                            case 1:
                                float a=15;float d=19;
                                float resultadoDiv= a/d;
                                System.out.println("Este es un Numero Flotante Posivito"+resultadoDiv);
                                break;
                            case 2:
                                    float b=-10;float c=18;
                                    float resultadoDivM= b/c;
                                    System.out.print("Este es Un Número Flotante Negativo"+resultadoDivM);
                                break;
                            case 3:
                                float e=5;float f=2;
                                float resultadoDivF= e/f;
                                System.out.print("Dividendo 5, Divisor 2  Resultado: "+resultadoDivF);
                                break;
                        }
                    }
                    break;
            }

        }
    }
}
// ESTE  me marca 24 advertencias , 5 advertencias debiles   pero no me los marca el programa no me los describe la consola esta  vacia.  ¿Comó se muestran los Errores?