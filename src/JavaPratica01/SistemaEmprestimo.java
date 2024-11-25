package JavaPratica01;
import java.util.Scanner;

public class SistemaEmprestimo {
    public static void main(String[] args) {
        // Pedindo os dados para o usuario
        Scanner meuDados = new Scanner(System.in);
        System.out.println("Qual a sua renda mensal ? ");
        System.out.println("Quanto deseja de emprestimo:");
        System.out.println("Você esta negativado: ");

        //Declarando as variaveis

        double rendaMensal = meuDados.nextDouble();
        double valorSolicitado = meuDados.nextDouble();
        boolean negativado = meuDados.nextBoolean();

        // Voltantos os dados para o usuario


        if (rendaMensal <= 500) {
            System.out.println("Inelegível para empréstimo");
        } else {
            if (rendaMensal < 2000.0) {
                System.out.println("Empréstimo negado. Motivo: renda insuficiente");
            }
            if (valorSolicitado > (rendaMensal / 2)) {
                System.out.println("Empréstimo negado. Motivo: valor solicitado muito alto");
            }
            if (negativado) {
                System.out.println("Empréstimo negado. Motivo: nome negativado");
            }
            if (rendaMensal >= 2000.0 && valorSolicitado <= (rendaMensal / 2) && !negativado) {
                System.out.println("Empréstimo aprovado!");
            }
        }


    }

}
