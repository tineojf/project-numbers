public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------");
        System.out.println("Conversor Digitos a Letras");
        System.out.println("-------------------------");

        for (int i = 1000; i < 999999; i += 73) {
            Conversor c = new Conversor();
            String numero = String.valueOf(i);
            System.out.println(numero + " - " + c.main(numero));
        }

    }
}