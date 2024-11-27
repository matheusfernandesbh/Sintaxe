package ControleDeFluxo;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner meuDados = new Scanner(System.in);
        System.out.println("Qual plano deseja adquirir ?");

       String plan = meuDados.nextLine();

        switch (plan) {
            case "Basic": {
                System.out.println("100 minutos de ligação;");
                break;
            }
            case "Midia": {
                System.out.println("100 minutos de ligação  WhatsApp e Instagram grátis;");
                break;
            }
            case "Turbo": {
                System.out.println("100 minutos de ligação  WhatsApp e Instagram grátis + 5 GB YouTube.");
                break;
            }
            default:
                System.out.println("Não temos esse Plano");
        }
        meuDados.close();
    }
}
