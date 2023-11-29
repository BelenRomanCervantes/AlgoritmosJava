import javax.swing.JOptionPane;

public class CalculoEsfera {
    public static void main(String[] args) {
    
        //Ventana de dialogo para recibir datos de entrada
        String radioStr = JOptionPane.showInputDialog(null, "Ingrese el radio de la esfera en cm");
        double radioDou = 0;
        
        //Prueba para marcar error en caso de recibir una entrada incorrecta
        try {
            radioDou = Double.parseDouble(radioStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero");
            main(args);
            System.exit(0);
        }

        //Calculo del volumen de la esfera
        double volumenEsfera = ((Math.pow(radioDou, 3)) * Math.PI * 4) /3;
        
        //Ventana de dialogo del resultado
        String resultado = "El volumen de la esfera es: " + volumenEsfera + " cm3";
        JOptionPane.showMessageDialog(null, resultado);
        
    }
}