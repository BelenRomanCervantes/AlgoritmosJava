import javax.swing.JOptionPane;

public class AreaTriangulo {
    public static void main(String[] args) {

        //Ventana de dialogo para solicitar la base del triangulo
        String baseStr = JOptionPane.showInputDialog(null, "Ingrese la BASE del triangulo en cm");
        double baseInt = 0;
        try {
            baseInt = Double.parseDouble(baseStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error!\nDebe ingresar un numero POSITIVO.");
            main(args);
            System.exit(0);
        }
        if (baseInt < 0) {
            JOptionPane.showMessageDialog(null, "Error!\nDebe ingresar un numero POSITIVO.");
            main(args);
            System.exit(0);
        } else {
        
        //Ventana de dialogo para solicitar la altura del triangulo
        String alturaStr = JOptionPane.showInputDialog(null, "Ingrese la ALTURA del triangulo en cm");
        double alturaInt = 0;
        try {
            alturaInt = Double.parseDouble(alturaStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error!\nDebe ingresar un numero POSITIVO.");
            main(args);
            System.exit(0);
        }
        if (alturaInt < 0) {
            JOptionPane.showMessageDialog(null, "Error!\nDebe ingresar un numero POSITIVO.");
            main(args);
            System.exit(0);
            } else {

        //Calculo del area del triangulo
        double areaTriangulo = (baseInt * alturaInt) / 2;

        //Imprimir respuesta
        String resultado = "El area del triangulo es de: " + areaTriangulo + " cm2";
        JOptionPane.showMessageDialog(null, resultado);
        }
        }
    }
    
}
