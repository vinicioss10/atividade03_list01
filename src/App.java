import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Faça um Programa que peça dois números e imprima a soma.
        // Entradas
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com o primeiro numero:");
        int num1 = teclado.nextInt();
        System.out.println("Entre com o segundo numero:");
        int num2 = teclado.nextInt();
        System.out.print("");
        teclado.close();
        // Processamentos
        int soma = num1 + num2;
        // Saidas
        System.out.printf("A soma de %d + %d = %d", num1, num2, soma);
    }
}
