public class AgeValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int AGE_lIMIT = 18;// Definir el límite de edad
       
        System.out.println("Enter your name:");// Solicitar el nombre del usuario
        int age = scanner.nextInt();// Leer el nombre ingresado

       System.out.println("Enter your age:");// Solicitar la edad del usuario
        int age = scanner.nextInt();// Leer la edad ingresada

        // Comprobar si la edad es mayor o igual al límite
        if (age >= AGE_LIMIT) {
            System.out.println("Access granted, " + name + "!");
        } else {
            System.out.println("Access denied, " + name + ".");
        }

        scanner.close();
    }
}