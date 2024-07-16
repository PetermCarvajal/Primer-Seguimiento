package SeptimoPunto;

import javax.swing.*;

public class Incre_Drecremento {
    public static void main(String[] args) {
        incremento();
        decremento();
    }
    public static void incremento() {
        //Incremento Funciona en el rango que se le da a la maquina en este caso el incremento se usara el incremento base entonces sera +1
        JOptionPane.showMessageDialog(null,"Incrementando 1 Hasta llegar 10 desde 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
    public static void decremento() {
        //En este Caso el Decremento que se Usara es el Decremento Base Por Lo que Sera -1
        JOptionPane.showMessageDialog(null,"Decrementando 1 Hasta llegar 1 Desde 10");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
