public class Conversor {
    private String[] valores29 = {
            "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve",
            "diez", "once", "doce", "trece", "catorce", "quince", "dieciseis", "diecisiete",
            "dieciocho", "diecinueve", "veinte", "veintiuno", "veintidos", "veintitres",
            "veinticuatro", "veinticinco", "veintiseis", "veintisiete", "veintiocho",
            "veintinueve"};

    private String[] valoresDecena = {
            "cero", "dieci", "veinti", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta",
            "ochenta", "noventa"};

    private String[] valoresCentena = {
            "cero", "ciento", "doscientos", "trescientos", "cuatrocientos", "quinientos",
            "seiscientos", "setecientos", "ochocientos", "novecientos"};

    private String texto = "";

    public void main() {
    }

    // Metodos para valores hasta 999
    public void valores29(int digit) {
        texto += valores29[digit];
    }

    public void valores99(int digit) {
        //Cast & divide
        String numero = String.valueOf(digit);
        String decena = numero.substring(0, 1);
        String unidad = numero.substring(1, 2);

        //Cast a int
        int dec = Integer.parseInt(decena);
        int uni = Integer.parseInt(unidad);

        if (dec == 0) {
            texto += valores29[uni];
        } else {
            texto += valoresDecena[dec] + valores29[uni];
        }

    }
}
