import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String palavra = scan.nextLine();

        palindromo(palavra);
    }

    private static void palindromo(String palavra) {
        String palavraInvertida = new StringBuffer(palavra).reverse().toString();
        if (palavra.equals(palavraInvertida)) {

            System.out.println("TRUE");
        } else {

            System.out.println("FALSE");
        }
    }
}