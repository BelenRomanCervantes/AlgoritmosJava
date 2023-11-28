import javax.swing.JOptionPane;

public class CalculoEsfera {
    public static void main(String[] args) {
    
        String radioStr = JOptionPane.showInputDialog(null, "Ingrese el radio de la esfera en cm");
        double radioDou = 0;
        try {
            radioDou = Double.parseDouble(radioStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero positivo");
            main(args);
            System.exit(0);
        }

        
        double volumenEsfera = ((Math.pow(radioDou, 3)) * Math.PI * 4) /3;
        String resultado = "El volumen de la esfera es: " + volumenEsfera + " cm3";
        JOptionPane.showMessageDialog(null, resultado);
    }
}