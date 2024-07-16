package DoceavoEjercicio;

import javax.swing.*;

public class Ciclos {
    public static void main(String[] args) {
        ciclo1();
        ciclo2();
        ciclo3();

    }
    public static void ciclo1() {
        //Tablas de multiplicar
        int a;
        String input = JOptionPane.showInputDialog("Ingrese el Multiplicando");
        a = Integer.parseInt(input);
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + (a * i));

        }
    }
    public static void ciclo2() {
        int a,b=0;
        String input = JOptionPane.showInputDialog("Ingrese  Hasta que Numero se va a Contar");
        a = Integer.parseInt(input);
        while ( b<a) {
            System.out.println(b);
            b++;
            if (b>a){//¿Prgunta Seria , Dondé esta el Error?
                JOptionPane.showMessageDialog(null,"Se ha llegado a "+a+" Fin del Conteo");
            break;
            }
        }
    }
    public static void ciclo3() {
    int edad;
                do {
                    String Edad=JOptionPane.showInputDialog("Ingrese su edad: ");
                    edad = Integer.parseInt(Edad);
                } while (edad < 18);

                System.out.println("Edad incorrecta,Su edad es: " + edad);
            }
    }


