import javax.swing.JOptionPane;

public class ImprimirNombre {
    public static void main(String[] args) {

        //Ventana de dialogo para solicitar la entrada de datos
        String nombre = JOptionPane.showInputDialog(null, "Cual es tu nombre?");
        
        //Respuesta
        String respuesta = "Hola " + nombre;

        //Impresion en consola
        System.out.println(respuesta);

        //Impresion en ventana de dialogo
        JOptionPane.showMessageDialog(null, respuesta);
    }
    
}
