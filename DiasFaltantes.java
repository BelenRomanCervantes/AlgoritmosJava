import java.time.LocalDate;

import javax.swing.JOptionPane;

public class DiasFaltantes {
    public static void main(String[] args) {
        
        /*Ventana de dialogo para recibir datos de entrada
        String dActStr = JOptionPane.showInputDialog(null, "Ingrese el dia actual (DD)");
        int dAct = 0;
        try {
            dAct = Integer.parseInt(dActStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero");
            main(args);
            System.exit(0);
        }
        String mActStr = JOptionPane.showInputDialog(null, "Ingrese el mes actual (MM)");
        int mAct = 0;
        try {
            mAct = Integer.parseInt(mActStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero");
            main(args);
            System.exit(0);
        }
        */

        LocalDate fechaAct = LocalDate.now();
        LocalDate diaMuertos = LocalDate.parse("Dia de muertos", formatter);
        



        /*Calculo de los dias faltantes ***Corregir: arroja negativos***
        if(mAct >= 11){

        }
        int diasHastaHoy = (mAct * 30) + (dAct * 1);
        int diasParaMuertos = 331 - diasHastaHoy;
        String resultadoMuertos = "Los dias que faltan hasta dia de muertos son: " + diasParaMuertos;
        int diasParaNavidad = 385 - diasHastaHoy;
        String resultadoNavidad = "Los dias faltantes para Navidad son: " + diasParaNavidad;

        //Ventana de dialogo de salida
        JOptionPane.showMessageDialog(null, resultadoMuertos);
        JOptionPane.showMessageDialog(null, resultadoNavidad);
*/


    }
    
}
