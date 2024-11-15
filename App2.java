import java.util.ArrayList;
import java.util.List;

public class App2 {

    public static void main(String[] args) {

        Integer[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19, 20};
        List<Integer> lista_primos = encontrarnumPrimos(numeros);
        System.out.println("Numeros primos: " + lista_primos);

    }

    public static List<Integer> encontrarnumPrimos (Integer[] numeros ) {
        List<Integer> lista_primos = new ArrayList<>();

        for (Integer i : numeros) {
            if (numeroesPrimo(i)) {
                lista_primos.add(i);
            }
        }
        return lista_primos;
    }

    public static boolean numeroesPrimo (Integer numero) {

        if (numero <= 1) return false;

        for (Integer i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

}