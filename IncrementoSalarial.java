import javax.swing.JOptionPane;

public class IncrementoSalarial {
    public static void main(String[] args) {
        
        //Ventana de dialogo para la entrada de datos
        String salActualStr = JOptionPane.showInputDialog(null, "Ingresa tu salario actual");
        double salActual = 0;
        
        //Prueba para marcar error en caso de recibir una entrada incorrecta
        try {
            salActual = Double.parseDouble(salActualStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error!\nDebes ingresar un numero positivo.\nVuelve a intentar.");
            main(args);
            System.exit(0);
        }
        if(salActual < 0){
            JOptionPane.showMessageDialog(null, "Error!\nDebes ingresar un numero positivo.\nVuelve a intentar.");
            main(args);
            System.exit(0);
        } else {

        //Calculo del incremento
        double salNuevo = 0.0;
        if(salActual <= 15000){
            salNuevo = salActual * 1.20;
        } else {
            salNuevo = salActual * 1.15;
        }

        //Mensaje de salida
        String respuesta = "Tu salario actualizado es: " + salNuevo;
        JOptionPane.showMessageDialog(null, respuesta);
    }
}
    
}
