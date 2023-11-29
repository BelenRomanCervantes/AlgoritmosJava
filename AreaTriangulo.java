import javax.swing.JOptionPane;

public class AreaTriangulo {
    public static void main(String[] args) {

        //Ventana de dialogo para solicitar la base del triangulo
        String baseStr = JOptionPane.showInputDialog(null, "Ingrese la base del triangulo en cm");
        double baseInt = 0;
        try {
            baseInt = Double.parseDouble(baseStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero");
            main(args);
            System.exit(0);
        }
        
        //Ventana de dialogo para solicitar la altura del triangulo
        String alturaStr = JOptionPane.showInputDialog(null, "Ingrese la altura del triangulo en cm");
        double alturaInt = 0;
        try {
            alturaInt = Double.parseDouble(alturaStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero");
            main(args);
            System.exit(0);
        }

        //Calculo del area del triangulo
        double areaTriangulo = (baseInt * alturaInt) / 2;

        //Imprimir respuesta
        String resultado = "El area del triangulo es de: " + areaTriangulo + " cm2";
        JOptionPane.showMessageDialog(null, resultado);

    }
    
}
