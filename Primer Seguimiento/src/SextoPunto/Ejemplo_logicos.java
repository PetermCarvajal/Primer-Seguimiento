package SextoPunto;

import javax.swing.*;

public class Ejemplo_logicos {
    public static void main(String[] args) {
        operador1();
        operador2();
        operador3();
    }
    public static void operador1() {
        //Operador Logico Y (&&)
        int a,b=13,C=15,d;
        //Adivina ambos números
        String input1=JOptionPane.showInputDialog("Ingrese un El Primer Número");
        a=Integer.parseInt(input1);
        String input2=JOptionPane.showInputDialog("Ingrese el Segundo Número");
        d=Integer.parseInt(input2);
        if (b==a && C==d){//Si ambos son correctos entonces valida (Y)
            JOptionPane.showMessageDialog(null,"Felicidades Usted Adivino Ambos Números");
        }else {
            JOptionPane.showMessageDialog(null,"Lo Sentimos , Usted no Adivino");
        }
    }
    public static void operador2() {
        int a,b=13,C=15,d;
        //Adivina 1 De los 2
        //Operador ||
        String input1=JOptionPane.showInputDialog("Ingrese el Primer Número");
        String input2=JOptionPane.showInputDialog("Ingrese el Segundo Número");
        a=Integer.parseInt(input1);
        d=Integer.parseInt(input2);
        if (b==a || C==d){
            JOptionPane.showMessageDialog(null,"Felicidaes Usted Adivino 1 Número");
        }else {
            JOptionPane.showMessageDialog(null,"Lo Sentimos , Usted no Adivino Ninguno de los Números");
        }

    }
    public static void operador3() {
        int a,b=13;
        /*
         Operador Negación !
         No se ni como explicar esto.
         */

        String input1=JOptionPane.showInputDialog("Ingrese 1 Número");
        a=Integer.parseInt(input1);
        if (!(b==a)){//Entonces Primero N
            JOptionPane.showMessageDialog(null,"Lo Sentimos , Usted no Adivino");
        }else {
            JOptionPane.showMessageDialog(null,"Felicidades Usted no Adivino ");
        }
    }
}
