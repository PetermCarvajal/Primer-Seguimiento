package Catorceavo;

import javax.swing.*;

public class BreakContinue {
    public static void main(String[] args) {
        breaks();
        continuar();
    }
    public static void breaks() {
        int a=1;
        switch(a) {
            case 1:
                JOptionPane.showMessageDialog(null,"En este Ejemplo No Usare el Break y entonces Caso 1 y Caso 2 Se Ejecutaran Pero El Caso 3 No");
            case 2:
                for (a=1; a<=10; a++) {
                    System.out.println(a);
                }
            break;
            case 3:
                JOptionPane.showMessageDialog(null,"Esto No se Mostrara");
            break;
        }
    }
    public static void continuar() {
        for (int i = 2; i <= 20; i++) {
            //esta es la Tabla del 2  Pero el continue hara que los Numeros que sean divisibles entre 2  no se muestren Por lo tanto No se deberia mostrar nada
            if (i % 2 == 0) {
                continue;
            }
            JOptionPane.showMessageDialog(null,"Vamos en: "+i);
        }
    }
}
