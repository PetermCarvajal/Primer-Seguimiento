package UndecimoEjercicio;


import javax.swing.*;

public class SentenciaSelector {
    public static void main(String[] args) {
        selector1();
        selector2();
        selector3();
    }
    public static void selector1() {
        String input=JOptionPane.showInputDialog(null, "Ingrese la dia de la semana ");
        switch(input){//Esto da error por que dice que esta Duplicado pero no esta Duplicado Lunes no es igual a lunes ¿Por qué da error?
            case "Lunes":
               JOptionPane.showMessageDialog(null,"Usted No tiene Clases el Lunes");
               break;
            case "Martes":
                JOptionPane.showMessageDialog(null,"Usted Tiene\n Matematicas\n Ingles\n Quimica Los Martes");
                break;
            case "Miercoles":
                JOptionPane.showMessageDialog(null,"Usted  Tiene Clases de Tejidos y Oratoria");
                break;
            case "Jueves":
                JOptionPane.showMessageDialog(null,"Usted Tiene \n Fisica \n Ciencas de la Computacoión\n Etica \n Religion");
                break;
            case "Viernes":
                JOptionPane.showMessageDialog(null,"Usted Tiene Baile y Lenguaje de Señas");
                break;
            case "lunes":
                JOptionPane.showMessageDialog(null,"Usted No tiene Clases el Lunes");
                break;
            case "martes":
                JOptionPane.showMessageDialog(null,"Usted Tiene\n Matematicas\n Ingles\n Quimica Los Martes");
                break;
            case "miercoles":
                JOptionPane.showMessageDialog(null,"Usted  Tiene Clases de Tejidos y Oratoria");
                break;
            case "jueves":
                JOptionPane.showMessageDialog(null,"Usted Tiene \n Fisica \n Ciencas de la Computacoión\n Etica \n Religion");
                break;
            case "viernes":
                JOptionPane.showMessageDialog(null,"Usted Tiene Baile y Lenguaje de Señas");
                break;
        }
    }
    public static void selector2() {
        JOptionPane.showMessageDialog(null,"911 ¿Cuál es su Emergencia?");
        String input=JOptionPane.showInputDialog(null, "1. Policia \n 2. Bomberos \n 3. Ambulancia");
        int opcion=Integer.parseInt(input);
        switch(opcion){
            case 1:
                JOptionPane.showMessageDialog(null,"La Patrulla Estara Con Ustede en 3 Minutos");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Los Bomberos llegaran a su Ubicacion en 10 Minutos");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"La Ambulancia Llega en 7 Minutos");
                break;
        }
    }
    public static void selector3() {
        //Selector de Idioma
        String input=JOptionPane.showInputDialog("Por Favor Ingres EL Idioma");
        switch(input){
            case "español":
                JOptionPane.showMessageDialog(null,"Usted a Elegido "+input);
                break;
            case "ingles":
                JOptionPane.showMessageDialog(null,"You Have Chosen "+input);
                break;
            case "chino":
                JOptionPane.showMessageDialog(null,"您已选择 "+input);
                break;
            case "japones":
                JOptionPane.showMessageDialog(null,"あなたが選んだ "+input);
                break;
            case "Español":
                JOptionPane.showMessageDialog(null,"Usted a Elegido "+input);
                break;
            case "Ingles":
                JOptionPane.showMessageDialog(null,"You Have Chosen "+input);
                break;
            case "Chino":
                JOptionPane.showMessageDialog(null,"您已选择 "+input);
                break;
            case "Japones":
                JOptionPane.showMessageDialog(null,"あなたが選んだ "+input);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Idioma No Reconocido");
                break;
        }
    }
}
