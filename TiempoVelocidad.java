import javax.swing.JOptionPane;

public class TiempoVelocidad {
    public static void main(String[] args) {

        //Ventana de dialogo para solicitar la distancia
        String distanciaStr = JOptionPane.showInputDialog(null, "Ingrese la DISTANCIA recorrida en km");
        double distancia = 0.0;
        
        //Comprobando que distancia es un numero
        try {
            distancia = Double.parseDouble(distanciaStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error!\nDebe ingresar un numero POSITIVO.\nVuelva a intentar.");
            main(args);
            System.exit(0);
        }

        //Comprobando que distancia es positivo
        if(distancia < 0){
            JOptionPane.showMessageDialog(null, "Error!\nDebe ingresar un numero POSITIVO.\nVuelva a intentar.");
            main(args);
            System.exit(0);
        } else {
        
        //Ventana de dialogo para solicitar la velocidad
        String velocidadStr = JOptionPane.showInputDialog(null, "Ingrese la VELOCIDAD a la que viajaba en km/h");
        double velocidad = 0.0;

        //Comprobando que velocidad es un numero
        try {
            velocidad = Double.parseDouble(velocidadStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error!\nDebe ingresar un numero POSITIVO.\nVuelva a intentar.");
            main(args);
            System.exit(0);
        }
        //Comprobando que velocidad es positivo
        if(velocidad < 0){
            JOptionPane.showMessageDialog(null, "Error!\nDebe ingresar un numero POSITIVO.\nVuelva a intentar.");
            main(args);
            System.exit(0);
        } else {
                
        //Calculo del tiempo
        double tiempo = distancia / velocidad;
        double minutos = tiempo *60;

        //Mensaje de respuesta
        String respuesta = "El tiempo que tardo en recorrer esa distancia fue de: " + minutos + " MINUTOS";
        JOptionPane.showMessageDialog(null, respuesta);

    }
}
}
    
}
