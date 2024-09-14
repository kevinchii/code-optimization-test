public class AgeValidation {
    public static void main(String[] args) {
        final int AGE = 18;
        
        if (AGE >= 18) {
            System.out.println("Access granted");
        }
        
        if (AGE < 18) {
            System.out.println("Access denied");
        }
    }
}
