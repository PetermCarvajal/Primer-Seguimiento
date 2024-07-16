package NovenoEjercicio;

import javax.swing.*;

public class OperadorTernario {
    public static void main(String[] args) {
        ejemplo1();
        ejemplo2();
        ejemplo3();
        ejemplo4();
        ejemplo5();
    }
    public static void ejemplo1() {
        //  Mayor de edad
        int edad,b=18;
        String input=JOptionPane.showInputDialog("Ingrese su Edad");
        edad = Integer.parseInt(input);
        String Valido=edad>=b?"Felicidades Usted Ya es Mayor De Edad":"Usted no Puede entrar";
        String valido = String.valueOf(Valido);
        JOptionPane.showMessageDialog(null,valido);

    }
    public static void ejemplo2() {
        String input=JOptionPane.showInputDialog("¿Usted  Acepta el Eula?");
        String confirmacion = input.equals("Si") ? "Disfrute del programa" : "Lamentamos su decisión"; //equals para strings , Que forma de complicarse la vida. por que no pusieron simplemente .Strings
        String valido = String.valueOf(confirmacion);
        JOptionPane.showMessageDialog(null,valido);
    }
    public static void ejemplo3() {
        //  Mayor que
        int a=8,b;
        String input=JOptionPane.showInputDialog("Ingrese un Número");
        b = Integer.parseInt(input);
        String Valido=b==a?"Ese Fue el Mes en el que la que la Perdi":"Sigue intentando";
        String valido = String.valueOf(Valido);
        JOptionPane.showMessageDialog(null,valido);
    }
    public static void ejemplo4() {
        int a=2023,b;
        String input=JOptionPane.showInputDialog("Ingrese un Año");
        b = Integer.parseInt(input);
        String Valido=a==b?"Ese Fue el Año en el que la Perdí":"Sigue intentando";
        String valido = String.valueOf(Valido);
        JOptionPane.showMessageDialog(null,valido);
    }
    public static void ejemplo5() {
        String input=JOptionPane.showInputDialog("¿Te Sientes Realizado?");
        String Valido=input.equals("Si")?"¿A Qué Costó?":"¿Sigues Buscando Eso que te Haga Sentir Realizado?";
        String valido = String.valueOf(Valido);
        JOptionPane.showMessageDialog(null,valido);
        //Me dice que ... Innecesario , pero el programa hace lo que quiero que haga No se como es  la otra forma.
    }
}
