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

    public String main(String numero) {
        int digit = Integer.parseInt(numero);

        if (digit <= 999) {
            udc(digit);
            return this.texto;
        } else {
            return "Numero fuera de rango";
        }
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

        if (uni == 0) {
            texto += valoresDecena[dec];
        } else {
            texto += valoresDecena[dec] + " y " + valores29[uni];
        }
    }

    public void valores999(int digit) {
        //Cast & divide
        String numero = String.valueOf(digit);
        String centena = numero.substring(0, 1);
        String decena = numero.substring(1, 2);
        String unidad = numero.substring(2, 3);

        //Cast a int
        int cen = Integer.parseInt(centena);
        int dec = Integer.parseInt(decena);
        int uni = Integer.parseInt(unidad);

        if (dec == 0 & uni == 0) {
            if (cen == 1) {
                texto += "cien";
            } else {
                texto += valoresCentena[cen];
            }
        } else {
            texto += valoresCentena[cen] + " ";
            udc(dec * 10 + uni);
        }
    }

    public void udc(int digit) {
        if (digit <= 29) {
            valores29(digit);
        } else if (digit <= 99) {
            valores99(digit);
        } else if (digit <= 999) {
            valores999(digit);
        } else {
            System.out.println("Numero fuera de rango");
        }
    }
}
