public class Ejercicio10 {
    public static void main(String[] args) {
        double paso1 = Math.sqrt(25) * 10;
        boolean paso2 = paso1 >= 100;
        double paso3 = 10.0 / 5;
        boolean paso4 = paso3 >= 2;
        boolean resultado = paso2 & true || false || paso4;
        System.out.println("El resultado es " + resultado);
    }
  
}
