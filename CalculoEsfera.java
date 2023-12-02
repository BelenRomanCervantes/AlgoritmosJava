import javax.swing.JOptionPane;

public class CalculoEsfera {
    public static void main(String[] args) {
    
        //Ventana de dialogo para recibir datos de entrada
        String radioStr = JOptionPane.showInputDialog(null, "Ingrese el RADIO de la esfera en cm");
        double radioDou = 0;
        
        //Prueba para marcar error en caso de recibir una entrada incorrecta
        try {
            radioDou = Double.parseDouble(radioStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error!\nDebe ingresar un numero POSITIVO");
            main(args);
            System.exit(0);
        }

        //Calculo del volumen de la esfera
        if (radioDou < 0) {
            JOptionPane.showMessageDialog(null, "Error!\nDebe ingresar un numero POSITIVO");
            main(args);
            System.exit(0);
        } else { 
        double volumenEsfera = ((Math.pow(radioDou, 3)) * Math.PI * 4) /3;
        
        //Ventana de dialogo del resultado
        String resultado = "El volumen de la esfera es de: " + volumenEsfera + " cm3";
        JOptionPane.showMessageDialog(null, resultado);
        }
    }
}