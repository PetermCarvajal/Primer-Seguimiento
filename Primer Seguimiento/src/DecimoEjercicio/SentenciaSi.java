package DecimoEjercicio;

import javax.swing.*;

public class SentenciaSi {
    public static void main(String[] args) {
        ejemplo1();
        ejemplo2();
        ejemplo3();
    }
    public static void ejemplo1() {
        //Mayoria de Edad
        int Req=18,a;
        String input=JOptionPane.showInputDialog("Por Favor Digite Su Edad");
        a=Integer.parseInt(input);
        if (Req>a){
            JOptionPane.showMessageDialog(null,"Los Menores de Edad No Pueden Entrar");
        }else {
            JOptionPane.showMessageDialog(null,"Bienvenido al Bar");
        }
    }
    public static void ejemplo2() {
        float Nota=3,a;
        String input=JOptionPane.showInputDialog("Por Favor Digite Su Nota");
        a=Float.parseFloat(input);
        if (Nota>a){
            JOptionPane.showMessageDialog(null,"Usted Perdio la Materia , Debe Recuperar");
        }else {
            JOptionPane.showMessageDialog(null,"Usted Gano la Materia, Puede Pasar al Siguiente Curso");
        }
    }
    public static void ejemplo3() {
        int dia;//Esto es del mes de Agosto del 2024
        String input=JOptionPane.showInputDialog("Por Favor la Fecha");
        dia=Integer.parseInt(input);
        if (dia==1){
            JOptionPane.showMessageDialog(null,"Jueves");
        }else if (dia==2){
            JOptionPane.showMessageDialog(null,"Viernes");
        }else if (dia==3){
            JOptionPane.showMessageDialog(null,"Sabado");
        }else if (dia==4){
            JOptionPane.showMessageDialog(null,"Domingo");
        }else if (dia==5){
            JOptionPane.showMessageDialog(null,"Lunes");
        }else if (dia==6){
            JOptionPane.showMessageDialog(null,"Martes");
        }else if (dia==7){
            JOptionPane.showMessageDialog(null,"Miercoles");
        }else if (dia==8){
            JOptionPane.showMessageDialog(null,"Jueves");
        }else if (dia==9){
            JOptionPane.showMessageDialog(null,"Viernes");
        }else if (dia==10){
            JOptionPane.showMessageDialog(null,"Sabado");
        }else if (dia==11){
            JOptionPane.showMessageDialog(null,"Domingo");
        }else if (dia==12){
            JOptionPane.showMessageDialog(null,"Lunes");
        }else if (dia==13){
            JOptionPane.showMessageDialog(null,"Martes");
        }else if (dia==14){
            JOptionPane.showMessageDialog(null,"Miercoles");
        }else if (dia==15){
            JOptionPane.showMessageDialog(null,"Jueves");
        }else if (dia==16){
            JOptionPane.showMessageDialog(null,"Viernes");
        }else if (dia==17){
            JOptionPane.showMessageDialog(null,"Sabado");
        }else if (dia==18){
            JOptionPane.showMessageDialog(null,"Domingo");
        }else if (dia==19){
            JOptionPane.showMessageDialog(null,"Lunes");
        }else if (dia==20){
            JOptionPane.showMessageDialog(null,"Martes");
        }else if (dia==21){
            JOptionPane.showMessageDialog(null,"Miercoles");
        }else if (dia==22){
            JOptionPane.showMessageDialog(null,"Jueves");
        }else if (dia==23){
            JOptionPane.showMessageDialog(null,"Viernes");
        }else if (dia==24){
            JOptionPane.showMessageDialog(null,"Sabado");
        }else if (dia==25){
            JOptionPane.showMessageDialog(null,"Domingo");
        }else if (dia==26){
            JOptionPane.showMessageDialog(null,"Lunes");
        }else if (dia==27){
            JOptionPane.showMessageDialog(null,"Martes");
        }else if (dia==28){
            JOptionPane.showMessageDialog(null,"Miercoles");
        }else if (dia==29){
            JOptionPane.showMessageDialog(null,"Jueves");
        }else if (dia==30){
            JOptionPane.showMessageDialog(null,"Viernes");
        }else if (dia==31){
            JOptionPane.showMessageDialog(null,"Sabado");
        }
    }
}