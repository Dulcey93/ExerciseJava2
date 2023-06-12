public class Main {
    public static void main(String[] args) {
        // Usando if
        int numeroIf = 5;

        if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }

        // Bucle While
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("Valor del número en el bucle While: " + numeroWhile);
        }

        // Bucle Do While
        int numeroDoWhile = 0;
        do {
            numeroDoWhile++;
            System.out.println("Valor del número en el bucle Do While: " + numeroDoWhile);
        } while (numeroDoWhile < 3);

        // Bucle For
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("Valor del número en el bucle For: " + numeroFor);
        }

        // Switch
        String estacion = "verano";

        switch (estacion) {
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            default:
                System.out.println("No es una estación válida");
        }
    }
}
