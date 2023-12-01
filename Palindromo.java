import javax.swing.JOptionPane;

public class Palindromo {
    public static void main(String[] args) {
        
        //Ventana de dialogo para solicitar la entrada de datos
        String cadena = JOptionPane.showInputDialog(null, "Introduzca una palabra o frase para saber si es un palindromo");
        
        //Eliminacion de los espacios al inicio y final
        String cadena2 = cadena.trim();

        //Eliminacion de espacios intermedios
        

        //Eliminacion de caracteres especiales

        //Comparacion de la primera y ultima mitad
        String primeraMitad = cadena2.substring(0, (cadena2.length()/2)+1);
        System.out.println(primeraMitad);
        String ultimaMitad = cadena2.substring((cadena2.length()/2), cadena2.length());
        System.out.println(ultimaMitad);
    }
    
}
