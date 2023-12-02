import javax.swing.JOptionPane;

public class Bisiesto {
    public static void main(String[] args) {
    
        //Ventana de dialogo para la entrada de datos
        String anStr = JOptionPane.showInputDialog(null, "Ingrese un numero de año para saber si es bisiesto");
        int an = 0;
        
        //Prueba para marcar error en caso de recibir una entrada incorrecta
        try {
            an = Integer.parseInt(anStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error!\nDebe ingresar un numero de año válido.\nVuelva a intentar.");
            main(args);
            System.exit(0);
        }
        if(an < 0){
            JOptionPane.showMessageDialog(null, "Error!\nDebe ingresar un numero de año válido.\nVuelva a intentar.");
            main(args);
            System.exit(0);
        } else {

        //Calculo y mensaje de salida
        if((an % 4 == 0) && ((an % 100 == 0) || (an % 400 == 0))){
            JOptionPane.showMessageDialog(null, "Si es un año bisiesto");
        } else {
            JOptionPane.showMessageDialog(null, "No es un año bisiesto");
        }
    }
     
    }
}
