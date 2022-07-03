/**
 *
 * @author bryan
 */
public class Primosv2 {
    public static void main(String[] args) {

        System.out.println("Numeros Primos del 1 al 10");
        for (int i=1; i<=10 ;i++){
            if(esPrimo(i)) {
                System.out.println(""+i);
            }

        }
    }

    public static Boolean esPrimo(int numero) {
        Boolean esPrimoActual = true;
        if(numero<2) {
            esPrimoActual = false;
        }
        else {
            for(int i=2; i*i<=numero; i++) {
                if(numero%i == 0){
                    esPrimoActual = false;
                    break;}
            }
        }
        return esPrimoActual;
    }
}