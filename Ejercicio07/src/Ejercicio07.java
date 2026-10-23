public class Ejercicio07 {
    public static void main(String[] args) {
        double paso1 = (Math.sqrt(81) + 9) / 3;
        boolean paso2 = paso1 == 9;
        boolean paso3 = 10 > 1;
        boolean paso4 = 100.0 / 25 > Math.sqrt(100);
        boolean resultado = paso2 || paso3 & paso4;
        System.out.println("El resultado es " + resultado);
    }
}
