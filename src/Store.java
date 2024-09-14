public class Store {
    public static void main(String[] args) {
        /* int p1 = 15;
        int p2 = 10;
        int p3 = 5;
        
        int total1 = p1 * 2;
        int total2 = p2 * 3;
        int total3 = p3 * 4; */
        
        final int[] price = { 15, 10, 5 };    /*la matriz "price" nos va a almacenar el valor de cada producto. */
        final int[] amound = { 2, 3, 4 };     /*la matriz "amound" nos va a almacenar el numero de productos que se van a comprar.*/
        
        int totalSales = 0;   /*variable que va a guardar el total de ventas. */

        for (int i = 0; i < price.length; i++) { /*realizamos un ciclo "for" para mover las posiciones en el arrays*/
            totalSales += (price[i] * amound[i]);
        }
        System.out.println(totalSales); /*imprimimos el total de ventas */

        final int VENTA_MINIMA = 50;
        if (totalSales > VENTA_MINIMA ) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}
