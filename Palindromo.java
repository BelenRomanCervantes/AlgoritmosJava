import javax.swing.JOptionPane;

public class Palindromo {
    public static void main(String[] args) {
        
        //Ventana de dialogo para solicitar la entrada de datos
        String cadena = JOptionPane.showInputDialog(null, "Introduzca una palabra o frase para saber si es un palindromo");
        
        //Convertir en minusculas, eliminar espacios y algunos aracteres especiales
        String cadenaLimpia = cadena.trim().toLowerCase().replace("á", "a").replace("é", "e").replace("í","i").replace("ó","o").replace("ú","u").replace(" ","").replace(".","");

        //Invertir la cadena
        String cadenaInvertida = new StringBuilder(cadenaLimpia).reverse().toString();
                
        //Mensaje de respuesta
        if(cadenaInvertida.equals(cadenaLimpia)){
            JOptionPane.showMessageDialog(null, "SI es un palindromo");
        } else {
            JOptionPane.showMessageDialog(null, "NO es un palindromo");
        }


        
        
    }
}
