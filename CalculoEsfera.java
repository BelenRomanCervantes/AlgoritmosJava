public class CalculoEsfera {
    public static void main(String[] args) {
    
        Double radio = 4.3;
        Double volumenEsfera = ((Math.pow(radio, 3)) * Math.PI * 4) /3;
        String resultado = "El volumen de la esfera es: " + volumenEsfera + " cm3";
        System.out.println(resultado);
    }
}