public class Desafio5 {

    //Escreva um programa que inverta os caracteres de um string.
    //
    //IMPORTANTE:
    //a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
    //b) Evite usar funções prontas, como, por exemplo, reverse;


    public static class InverteString {
        public static void main(String[] args) {
            // Define a string a ser invertida
            String original = "Hello, world!";

            // Cria uma string vazia para armazenar a string invertida
            String invertida = "";

            // Itera sobre a string original de trás para frente e adiciona cada caractere à string invertida
            for (int i = original.length() - 1; i >= 0; i--) {
                invertida += original.charAt(i);
            }

            // Imprime a string invertida
            System.out.println(invertida);
        }
    }

}
