public class main {
    public static void main(String[] args) {
        double temperatura = 25;
        TermometroIoT termometro = new TermometroIoT(temperatura);

        System.out.println("Temperatura en Celsius: " + temperatura + " grados");
        System.out.println("Temperatura en Fahrenheit: " + termometro.obtenerFahrenheit() + " grados");
    }
}
