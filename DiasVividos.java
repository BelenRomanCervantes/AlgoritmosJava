
import javax.swing.JOptionPane;

public class DiasVividos {
    public static void main(String[] args) {
        
        //Solicitar el anio de nacimiento
        String aNacStr = JOptionPane.showInputDialog("Ingresa el AÑO en que naciste (Formato: AAAA)");
        int aNac = 0;
        try {
            aNac = Integer.parseInt(aNacStr);
        } catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Error!\nDebes ingresar un NUMERO ENTERO");
            main(args);
            System.exit(0);
        }

        //Solicitar el mes de nacimiento
        String mNacStr = JOptionPane.showInputDialog("Ingresa el MES en que naciste (Formato: MM)");
        int mNac = 0;
        try {
            mNac = Integer.parseInt(mNacStr);
        } catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Error!\nDebes ingresar un NUMERO ENTERO");
            main(args);
            System.exit(0);
        }

        //Solicitar el dia de nacimiento
        String dNacStr = JOptionPane.showInputDialog("Ingresa el DÍA en que naciste (Formato: DD)");
        int dNac = 0;
        try {
            dNac = Integer.parseInt(dNacStr);
        } catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Error!\nDebes ingresar un NUMERO ENTERO");
            main(args);
            System.exit(0);
        }

        //Definir fecha actual
        String aActStr = JOptionPane.showInputDialog("Ingresa el AÑO ACTUAL (Formato: AAAA)");
        int aAct = 0;
        try {
            aAct = Integer.parseInt(aActStr);
        } catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Error!\nDebes ingresar un NUMERO ENTERO");
            main(args);
            System.exit(0);
        }

        String mActStr = JOptionPane.showInputDialog("Ingresa el MES ACTUAL (Formato: MM)");
        int mAct = 0;
        try {
            mAct = Integer.parseInt(mActStr);
        } catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Error!\nDebes ingresar un NUMERO ENTERO");
            main(args);
            System.exit(0);
        }

        String dActStr = JOptionPane.showInputDialog("Ingresa el DÍA ACTUAL (Formato: DD)");
        int dAct = 0;
        try {
            dAct = Integer.parseInt(dActStr);
        } catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Error!\nDebes ingresar un NUMERO ENTERO");
            main(args);
            System.exit(0);
        }

        //Calcular los dias vividos con base en los anios
        int dVividos = 0;
        int bisiestos = ((aAct - aNac) / 4);
        if(aNac > aAct){
            JOptionPane.showMessageDialog(null, "El año de nacimiento es posterior al año actual.\nVuelve a intentar");
            main(args);
            System.exit(0);
        } else {
            dVividos = ((aAct - aNac) * 365) + (1 * bisiestos);
        }
        
        //Calculo
        if(mNac == mAct && dNac == dAct){
            JOptionPane.showMessageDialog(null, "FELICIDADES!! HOY ES TU CUMPLEAÑOS!!\nHasta el dia de hoy has vivido: " + dVividos + " dias");
        } else if(mNac < mAct){
            int diasD = 0;
                for(int i = mNac; i < mAct; i++){
                    if(i == 1){
                            diasD = 31;
                    } else if(i == 2){ 
                            diasD += 28;
                    } else if(i == 3){
                            diasD += 31;
                    } else if(i == 4){
                            diasD += 30;
                    } else if(i == 5){
                            diasD += 31;
                    } else if(i == 6){
                            diasD += 30;
                    } else if(i == 7){
                            diasD += 31;
                    } else if(i == 8){
                            diasD += 31;
                    } else if(i == 9){
                            diasD += 30;
                    } else if(i == 10){
                            diasD += 31;
                    } else if(i == 11){
                            diasD += 30;
                    } else {
                            diasD += 31;
                    }
                }
            int diasDespuesCumple = diasD - dNac + dAct;
            dVividos += diasDespuesCumple;
            JOptionPane.showMessageDialog(null, "Hasta el dia de hoy has vivido: " + dVividos + " dias");
        } else if(mAct > mAct){
            int diasD = 0;
                for(int i = mAct; i < mNac; i++){
                    if(i == 1){
                            diasD = 31;
                    } else if(i == 2){ 
                            diasD += 28;
                    } else if(i == 3){
                            diasD += 31;
                    } else if(i == 4){
                            diasD += 30;
                    } else if(i == 5){
                            diasD += 31;
                    } else if(i == 6){
                            diasD += 30;
                    } else if(i == 7){
                            diasD += 31;
                    } else if(i == 8){
                            diasD += 31;
                    } else if(i == 9){
                            diasD += 30;
                    } else if(i == 10){
                            diasD += 31;
                    } else if(i == 11){
                            diasD += 30;
                    } else {
                            diasD += 31;
                    }
                }
            int diasHastaCumple = diasD + dAct - dNac;
            dVividos -= diasHastaCumple;
            JOptionPane.showMessageDialog(null, "Hasta el dia de hoy has vivido: " + dVividos + " dias");
        } else if(mAct == mNac && dAct > dNac){
            dVividos -= dAct - dNac;
            JOptionPane.showMessageDialog(null, "Hasta el dia de hoy has vivido: " + dVividos + " dias");
        } else if(mAct == mNac && dAct < dNac){
            dVividos -= dNac - dAct;
            JOptionPane.showMessageDialog(null, "Hasta el dia de hoy has vivido: " + dVividos + " dias");
        }
    }

}   

