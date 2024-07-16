package Treceavo;

import javax.swing.*;

public class ForEach { //Hay un Array de elementos que se recorre.
    public static void main(String[] args) {
        String[] nombres = {"Football", "Baloncesto", "Ciclismo","Senderismo","Natación"};
        for (String Todos : nombres) {
            JOptionPane.showMessageDialog(null,Todos);
        }

    }
}
