import javax.swing.JOptionPane;

public class ParImpar {
    public static void main(String[] args) {

        String numStr = JOptionPane.showInputDialog(null, "Ingrese un numero para saber si es par o impar");
        double num1 = 0;
        try {
            num1 = Double.parseDouble(numStr);
        } catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero");
            main(args);
            System.exit(0);
        }
        if(num1 % 2 == 0){
            JOptionPane.showMessageDialog(null, "Es un numero par");
        } else {
            JOptionPane.showMessageDialog(null, "Es un numero impar");
        }
    }
    
}
