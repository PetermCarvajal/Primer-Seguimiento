package SextoPunto;

import javax.swing.*;

public class Ejemplo_2 {//y Ejemplo 3


    public static  void main(String[] args){
        suma();
        Modulo();
    }//si se tiene main (String [] args) No deja llamarla , Pero debe llamarse main el que llame al resto por algún motivo; investivar y preguntar.
    public static void suma() { // Suma
        int a,b; //También se pueden usar 1 Tipo para definir varias variables
        String input1=JOptionPane.showInputDialog("Ingrese el primer Número");
        String input2=JOptionPane.showInputDialog("Ingrese el segundo Número");
        a=Integer.parseInt(input1);
        b=Integer.parseInt(input2);
        int resultado=a+b;
        JOptionPane.showMessageDialog(null,"El resultado es: "+resultado);
    }
    public static void Modulo(){
        int a,b,resultado;
        String input1=JOptionPane.showInputDialog("Ingrese el Primer Número");
        String input2=JOptionPane.showInputDialog("Ingrese el Segundo Número");
        a=Integer.parseInt(input1);
        b=Integer.parseInt(input2);
        resultado=a%b;
        JOptionPane.showMessageDialog(null,"El Residuo es: "+resultado);
    }

}
