import javax.swing.JOptionPane;

public class Factorial {
    public static void main(String[] args) {

        //Ventana de dialogo para recibir datos de entrada
        String numStr = JOptionPane.showInputDialog(null, "Ingrese cualquier numero entero para conocer su factorial");
        int numInt = 0;

        //Prueba para marcar error en caso de recibir una entrada incorrecta
        try {
            numInt = Integer.parseInt(numStr);
        } catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }
        
        //Calculo del factorial
        int fact = 1;
        for(int i = 2; i <= numInt; i ++){
            fact = fact * i;
        }

        //Ventana de dialogo del resultado
        String resultado = "El factorial es: " + fact;
        JOptionPane.showMessageDialog(null, resultado);
    }
}