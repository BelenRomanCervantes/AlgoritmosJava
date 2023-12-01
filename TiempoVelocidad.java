import javax.swing.JOptionPane;

public class TiempoVelocidad {
    public static void main(String[] args) {

        //Ventana de dialogo para la entrada de datos
        String distanciaStr = JOptionPane.showInputDialog(null, "Ingrese la distancia recorrida en km");
        double distancia = 0.0;

        try {
            distancia = Double.parseDouble(distanciaStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero");
            main(args);
            System.exit(0);
        }
        
        String velocidadStr = JOptionPane.showInputDialog(null, "Ingrese la velocidad a la que viajaba en km/h");
        double velocidad = 0.0;

        try {
            velocidad = Double.parseDouble(velocidadStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero");
            main(args);
            System.exit(0);
        }
        
        //Calculo del tiempo
        double tiempo = distancia / velocidad;

        //Mensaje de respuesta
        String respuesta = "El tiempo que tardo en recorrer esa distancia fue de: " + tiempo + " horas";
        JOptionPane.showMessageDialog(null, respuesta);

    }
    
}
