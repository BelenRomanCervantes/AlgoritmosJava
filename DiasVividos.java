import javax.swing.JOptionPane;

public class DiasVividos {
    public static void main(String[] args) {
        
        //Ventana de dialogo para la entrada de datos
        String anioNacStr = JOptionPane.showInputDialog("Ingresa el año en que naciste (Formato: AAAA)")
        int anioNac = 0;

        //Prueba para marcar error en caso de recibir una entrada incorrecta
        try {
            anioNac = Integer.parseInt(anioNacStr);
        } catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Error: Debes ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        //

    }
}
