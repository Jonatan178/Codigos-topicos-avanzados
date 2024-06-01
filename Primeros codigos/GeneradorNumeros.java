import java.util.Random;

public class GeneradorNumeros {
    public static int generarNumeroAleatorio(int minimo, int maximo) {
        Random rand = new Random();
        return rand.nextInt((maximo - minimo) + 1) + minimo;
    }

    public static void main(String[] args) {
        int numeroAleatorio = generarNumeroAleatorio(1, 100); 
        System.out.println("Número aleatorio: " + numeroAleatorio);
    }
}