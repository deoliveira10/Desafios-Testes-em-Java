import java.util.Scanner;

public class Desafio2 {

    //Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma
    // dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem
    // que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando
    // se o número informado pertence ou não a sequência.

    //IMPORTANTE:
    //Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

    public static class Fibonacci {
        public static void main(String[] args) {
            int num1 = 0, num2 = 1, proximoNum = 0;
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
            int numero = entrada.nextInt();

                if (numero == num1 || numero == num2) {
                    System.out.println(numero + " pertence à sequência de Fibonacci.");
                } else {
                    while (proximoNum < numero) {
                        proximoNum = num1 + num2;
                        num1 = num2;
                        num2 = proximoNum;
                    }

                if (proximoNum == numero) {
                    System.out.println(numero + " pertence à sequência de Fibonacci.");
                } else {
                    System.out.println(numero + " não pertence à sequência de Fibonacci.");
                }

                }
        }
    }
}
