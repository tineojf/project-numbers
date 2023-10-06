public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------");
        System.out.println("Conversor Digitos a Letras");
        System.out.println("-------------------------");

        for (int i = 1; i < 1001; i++) {
            Conversor c = new Conversor();
            String numero = String.valueOf(i);
            System.out.println(c.main(numero));
        }
    }
}