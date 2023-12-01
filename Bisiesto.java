import javax.swing.JOptionPane;

public class Bisiesto {
    public static void main(String[] args) {
    
        //Ventana de dialogo para la entrada de datos
        String anStr = JOptionPane.showInputDialog(null, "Ingrese un numero de año (Formato: AAAA) para saber si es bisiesto");
        int an = 0;
        
        //Prueba para marcar error en caso de recibir una entrada incorrecta
        try {
            an = Integer.parseInt(anStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero");
            main(args);
            System.exit(0);
        }

        //Calculo y mensaje de salida
        if((an % 4 == 0) && ((an % 100 == 0) || (an % 400 == 0))){
            JOptionPane.showMessageDialog(null, "Si es bisiesto");
        } else {
            JOptionPane.showMessageDialog(null, "No es bisiesto");
        }
     
    }
}
