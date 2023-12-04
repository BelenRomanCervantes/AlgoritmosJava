import javax.swing.JOptionPane;

public class DiasFaltantes {
    public static void main(String[] args) {
        
        //Ventana de dialogo para recibir datos de entrada
        String dActStr = JOptionPane.showInputDialog(null, "Ingrese el NUMERO del DIA actual");
        int dAct = 0;
        try {
            dAct = Integer.parseInt(dActStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error!\nDebe ingresar un NUMERO");
            main(args);
            System.exit(0);
        }
        String mActStr = JOptionPane.showInputDialog(null, "Ingrese el NUMERO del MES actual");
        int mAct = 0;
        try {
            mAct = Integer.parseInt(mActStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error!\nDebe ingresar un NUMERO");
            main(args);
            System.exit(0);
        }

        //Calculo de los dias que han pasado hasta dAct
        int diasHastaHoy = 0;
        switch (mAct) {
            case 1: 
                diasHastaHoy = dAct + 0;
                break;
            case 2: 
                diasHastaHoy = dAct + 31;
                break;
            case 3: 
                diasHastaHoy = dAct + 31 + 28;
                break;
            case 4:
                diasHastaHoy = dAct + 31 + 28 + 31;
                break;
            case 5:
                diasHastaHoy = dAct + 31 + 28 + 31 + 30;
                break;
            case 6:
                diasHastaHoy = dAct + 31 + 28 + 31 + 30 + 31;
                break;
            case 7:
                diasHastaHoy = dAct + 31 + 28 + 31 + 30 + 31 + 30; 
                break;   
            case 8:
                diasHastaHoy = dAct + 31 + 28 + 31 + 30 + 31 + 30 + 31;
                break; 
            case 9:
                diasHastaHoy = dAct + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
                break;
            case 10:
                diasHastaHoy = dAct + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
                break;
            case 11:
                diasHastaHoy = dAct + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
                break;
            case 12:
                diasHastaHoy = dAct + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
                break;
        }

        //Calculo de excepciones (Dia de muertos)
        int diasParaMuertos = 0;
        if(mAct == 11 && dAct == 1){
            JOptionPane.showMessageDialog(null, "Felicidades!! Hoy es DIA DE MUERTOS");
        } else if(mAct == 11 && dAct > 1){
            diasParaMuertos = 365 - dAct;
            JOptionPane.showMessageDialog(null, "Faltan: " + diasParaMuertos + " dias para DIA DE MUERTOS");
        } else if(mAct == 12){
            diasParaMuertos = 365 - (29 + dAct);
            JOptionPane.showMessageDialog(null, "Faltan: " + diasParaMuertos + " dias para DIA DE MUERTOS");
        } else {
            diasParaMuertos = 331 - diasHastaHoy;
            JOptionPane.showMessageDialog(null, "Faltan: " + diasParaMuertos + " dias para DIA DE MUERTOS");
        }

        //Calculo de excepciones (Navidad)
        int diasParaNavidad = 0;
        if(mAct == 12 && dAct == 24){
            JOptionPane.showMessageDialog(null, "Felicidades!! Hoy es NAVIDAD");
        } else if(mAct == 12 && dAct > 24){
            diasParaNavidad = 365 - dAct;
            JOptionPane.showMessageDialog(null, "Faltan: " + diasParaNavidad + " dias para NAVIDAD");
        } else {
            diasParaNavidad = 358 - diasHastaHoy;
            JOptionPane.showMessageDialog(null, "Faltan: " + diasParaNavidad + " dias para NAVIDAD");
        }
        
    }


}
    

