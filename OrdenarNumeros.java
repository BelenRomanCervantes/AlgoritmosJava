import javax.swing.JOptionPane;

public class OrdenarNumeros {
    public static void main(String[] args) {

        //Ventana de dialogo para recibir datos de entrada
        String numStr1 = JOptionPane.showInputDialog(null, "Ingrese un numero");
        double num1 = 0;
        try {
            num1 = Double.parseDouble(numStr1);
        } catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero");
            main(args);
            System.exit(0);
        }
        String numStr2 = JOptionPane.showInputDialog(null, "Ingrese un segundo numero");
        double num2 = 0;
        try {
            num2 = Double.parseDouble(numStr2);
        } catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero");
            main(args);
            System.exit(0);
        }
        String numStr3 = JOptionPane.showInputDialog(null, "Ingrese un tercer numero");
        double num3 = 0;
        try {
            num3 = Double.parseDouble(numStr3);
        } catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero");
            main(args);
            System.exit(0);
        }
        String numStr4 = JOptionPane.showInputDialog(null, "Ingrese un cuarto numero");
        double num4 = 0;
        try {
            num4 = Double.parseDouble(numStr4);
        } catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero");
            main(args);
            System.exit(0);
        }
        String numStr5 = JOptionPane.showInputDialog(null, "Ingrese un quinto numero");
        double num5 = 0;
        try {
            num5 = Double.parseDouble(numStr5);
        } catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero");
            main(args);
            System.exit(0);
        }


        //Ciclo para ordenar los numeros
        double nuevo = 0;
        for(int i = 1; i == 5; i++){
            if(i == 1){
                double a = nuevo;
            } else (i == 2) {
                double b = a;
                


            }
        }
        
        String listaOrdenada = a + " " + b + " " + c + " " + d + " " + e;
        
        //Ventana de dialogo de salida de datos
        JOptionPane.showMessageDialog(null, listaOrdenada);
    }
}
