public class App {
    public static int sumar (int a, int b) {
        return a + b;
    }
    public static int restar (int a, int b) {
        return a - b;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hola, soy una calculadora de Java");
        int resultado = sumar(5, 3);
        System.out.println("El resultado de la suma es: " + resultado);
        System.err.println("El resultado de la resta es: " + restar(5, 3));
    }
}
