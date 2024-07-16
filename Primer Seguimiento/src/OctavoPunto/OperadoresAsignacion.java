package OctavoPunto;

import javax.swing.*;

public class OperadoresAsignacion {
    public static void main(String[] args) {
        operador1();
        operador2();
        operador3();
    }
    public static void operador1() {
        int a=12,b;//Adivina la edad de la gata
        String input=JOptionPane.showInputDialog("Ingrese un número");
        b=Integer.parseInt(input);
        if (b==a){
            JOptionPane.showMessageDialog(null,"Usted Adivino la Edad de mi Gata ");
        }else {
            JOptionPane.showMessageDialog(null,"Usted No Adivno la Edad de mi Gata ");
        }
    }
    public static void operador2() {
        int a=12,b;
        String input=JOptionPane.showInputDialog("Ingrese 1 Número");
        b=Integer.parseInt(input);
        if(b<a) {
          JOptionPane.showMessageDialog(null,"Usted Ingreso un Número mayor");
        }else {
            JOptionPane.showMessageDialog(null,"Usted No Ingreso un Número mayor");
        }

    }
    public static void operador3() {
        int a=12,b;
        String input=JOptionPane.showInputDialog("Ingrese Un Número");
        b=Integer.parseInt(input);
        if(b>a) {
            JOptionPane.showMessageDialog(null,"Usted Ingreso un Numero mayor");
        }else {
            JOptionPane.showMessageDialog(null,"Usted No Ingreso un Numero mayor");
        }
    }
}
