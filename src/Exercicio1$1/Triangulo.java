package Exercicio1$1;

public class Triangulo {
    public static void main(String[] args) {
        int altura = 4; // altura do triângulo

        for (int i = 1; i <= altura; i++) {
            // imprimir espaços
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            // imprimir asteriscos
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // mudar para a próxima linha
            System.out.println();
        }
    }
}

