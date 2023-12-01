import java.util.Scanner;

import javax.swing.JOptionPane;

public class OrdenarNumeros {
    public static void main(String[] args) {

        /*Ventana de dialogo para recibir datos de entrada
        String numStr1 = JOptionPane.showInputDialog(null, "Ingrese un numero");
        int num1 = 0;
        try {
            num1 = Integer.parseInt(numStr1);
        } catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero");
            main(args);
            System.exit(0);
        }
        String numStr2 = JOptionPane.showInputDialog(null, "Ingrese un segundo numero");
        int num2 = 0;
        try {
            num2 = Integer.parseInt(numStr2);
        } catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero");
            main(args);
            System.exit(0);
        }
        String numStr3 = JOptionPane.showInputDialog(null, "Ingrese un tercer numero");
        int num3 = 0;
        try {
            num3 =Integer.parseInt(numStr3);
        } catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero");
            main(args);
            System.exit(0);
        }
        String numStr4 = JOptionPane.showInputDialog(null, "Ingrese un cuarto numero");
        int num4 = 0;
        try {
            num4 = Integer.parseInt(numStr4);
        } catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero");
            main(args);
            System.exit(0);
        }
        String numStr5 = JOptionPane.showInputDialog(null, "Ingrese un quinto numero");
        int num5 = 0;
        try {
            num5 = Integer.parseInt(numStr5);
        } catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero");
            main(args);
            System.exit(0);
        }
        */

        //Creacion de un arreglo con los datos de entrada
        int array[] = new int[4];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        String num1Str = scanner.nextLine();
        array[1] = 0;

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        String num2Str = scanner.nextLine();
        array[2] = 0;


        //Ciclo para ordenar los numeros
        for (int i = 0; i < array.length; i++) {
            for (int nuevo = i + 1; nuevo < array.length; nuevo++) {
                if (array[nuevo] < array[i]){
                    int aux = array[nuevo];
                    array[nuevo] = array[i];
                    array[i] = aux;
                }
            }
        }

        //Ciclo para iterar sobre los elementos del array
        for(int i = 0; i < array.length; i++){
        System.out.println(array[i]);
        }
        //String listaOrdenada = Arrays.toString(array[i]);

        //Ventana de dialogo de salida de datos
        //JOptionPane.showMessageDialog(null, listaOrdenada);
    }
}
