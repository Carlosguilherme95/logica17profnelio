import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero inteiro");
        int n = Integer.parseInt(scanner.nextLine());
        int in = 0;
        int out = 0;
        for(int i = 0; i < n; i++){
            System.out.println("digite um numero inteiro");
            int x = Integer.parseInt(scanner.nextLine());
            if (x >= 10 && x <= 20) {
                    in++;
                } else {
                    out++;
                }
                System.out.println(in);
                System.out.println(out);

            }
        }
    }
/**
 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
 * Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
 * essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
 */