import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("Formulário de solicitação de abertura de conta no Banco LWD");

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Qual sua idade?");
        int idade = scanner.nextInt();

        System.out.println("Qual o seu número de telefone? (81)");
        int celular = scanner.nextInt();

        System.out.println("Digite seu CPF: ");
        long cpf = scanner.nextLong();

        System.out.println("Qual sua renda mensal? R$");
        double rendaMensal = scanner.nextDouble();

        double creditoInicial = rendaMensal * .30;

        System.out.println("Parabéns, " + nome + " " + sobrenome + ", Você abriu uma Conta Bancária com sucesso no Banco LWD.");
        System.out.println("Foi liberado, inicialmente, o valor de R$ " + creditoInicial + " de crédito sem anuidade.");
        System.out.println("Aproveite!");

        System.out.println("Escolha o dia de vencimento do seu cartão de crédito.");
        short vencimentoCartao = scanner.nextShort();

        System.out.println("O dia de pagamento de sua fatura será dia: " + (vencimentoCartao + 10));
        System.out.println("O Banco LWD agradece a preferêcia!");
    }
}