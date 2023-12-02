import javax.swing.JOptionPane;

public class OrdenarNumeros {
    public static void main(String[] args) {

        //Declaracion de las variables
        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;
        double f = 0;
        
        //Ciclo for
        for(int i = 1; i <= 5; i++){

        //Ventana de dialogo para recibir datos de entrada
        String numStr = JOptionPane.showInputDialog(null, "Ingrese un numero");
        double num = 0;
        try {
            num = Double.parseDouble(numStr);
        } catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Error!\nUno de los elementos introducidos no fue un número\npor lo tanto el programa será REINICIADO.\nPor favor introduzca solo NUMEROS.");
            main(args);
            System.exit(0);
        }

        //Sentencias if para acomodar los numeros
        if(i == 1){
            a = num;
        } else if(i == 2){
            if(a > num){
                b = a;
                a = num;
            } else {
                b = num;
            }
        } else if(i == 3){
                if(a > num){
                    c = b;
                    b = a;
                    a = num;
                } else if (b > num){
                    c = b;
                    b = num;
                } else {
                    c = num;
                }
        } else if(i == 4){
            if(a > num){
                d = c;
                c = b;
                b = a;
                a = num;
            } else if(b > num){
                d = c;
                c = b;
                b = num;
            } else if(c > num){
                d = c;
                c = num;
            } else {
                d = num;
            }
        } else if(i == 5){
            if(a > num){
                f = d;
                d = c;
                c = b;
                b = a;
                a = num;
            } else if(b > num){
                f = d;
                d = c;
                c = b;
                b = num;
            } else if(c > num){
                f = d;
                d = c;
                c = num;
            } else if(d > num){
                f = d;
                d = num;
            } else {
                f = num;
            }
        }

        }
        
        //Reconversion de los numeros a Strings
        String aStr = String.valueOf(a);
        String bStr = String.valueOf(b);
        String cStr = String.valueOf(c);
        String dStr = String.valueOf(d);
        String eStr = String.valueOf(f);

        //Armado de la respuesto en un solo String
        String listaOrdenada = "Numeros ordenados de menor a mayor:\n" + aStr + ", " + bStr + ", " + cStr + ", " + dStr + ", " + eStr;

        //Ventana de dialogo de salida de datos
        JOptionPane.showMessageDialog(null, listaOrdenada);
         
        
        
    }
}