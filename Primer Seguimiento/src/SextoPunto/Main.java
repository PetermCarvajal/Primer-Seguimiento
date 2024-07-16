import javax.swing.*;
import java.util.Scanner;

public class Main {//Ejemplo 1
    public static void main(String[] args) {
        int a;int b; //Multiplicación
        String input1=JOptionPane.showInputDialog(null,"Buenos Días y Bienvenido Por favor Ingrese el Primer Número");
        a =Integer.parseInt(input1);
        String input2=JOptionPane.showInputDialog(null,"Por favor ingrese el Segundo Número");
        b = Integer.parseInt(input2);
        int Resultado=a*b;
        System.out.println(Resultado);
    }
}
/*private class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        float a = sc.nextFloat();
        System.out.println("Ingrese el segundo numero");
        float b = sc.nextFloat();
    }
}
Da Error
*/

