import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        int metadeInferior = numero/2;
        Primos primos = new Primos(2, metadeInferior);
        Primos primos2 = new Primos(metadeInferior + 1, numero);
        primos.start();
        primos2.start();
        try{
            primos.join();
        }catch(InterruptedException err){
            err.printStackTrace();
        }
        try{
            primos2.join();
        }catch(InterruptedException err){
            err.printStackTrace();
        }
        int quantidade = 0;
        quantidade = primos.getQuantidade() + primos2.getQuantidade();
        System.out.println(quantidade);
        teclado.close();
    }
}
