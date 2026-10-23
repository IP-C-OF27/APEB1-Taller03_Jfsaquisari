public class Ejercicio06 {
    public static void main(String[] args) {
    double raiz = Math.sqrt(81);
    double arriba = (raiz + 9) / 3;
    boolean paso1 = arriba == 9;
    boolean paso2 = 10 > 1;
    boolean resultado = paso1 & paso2; 
        System.out.println("El resultado es " + resultado);
    }
  
}
