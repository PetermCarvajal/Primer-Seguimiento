package Catorceavo;


import javax.swing.*;

public class BreakContinue {
    public static void main(String[] args) {
        breaks();
        continuar();
    }
    public static void breaks() {
        String a= JOptionPane.showInputDialog(null,"Seleccione 1 Ejemplo \n 1. \n 2. \n 3.");
        int b=Integer.parseInt(a);
        switch(b) {
            case 1:
                JOptionPane.showMessageDialog(null,"En este Ejemplo No Usare el Break y entonces Caso 1 y Caso 2 Se Ejecutaran Pero El Caso 3 No");
            case 2:
                for (b=1; b<=10; b++) {
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
