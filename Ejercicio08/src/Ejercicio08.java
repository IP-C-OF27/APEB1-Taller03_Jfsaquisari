public class Ejercicio08 {
    public static void main(String[] args) {
        double paso1 = (10 * 9) + 20 - 500.00 / 2 + Math.pow(3, 2);
        boolean paso2 = paso1 >= 200;
        int paso3 = 50 - 50 + 51;
        boolean paso4 = 50 >= paso3; 
        boolean resultado = paso2 || paso4;
        System.out.println("El resultado es " + resultado);
    }
}
