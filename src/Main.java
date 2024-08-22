import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome, tipoConta;
        double saldo;
        int escolha = 0;

        nome = "João Guilherme";
        tipoConta = "Corrente";
        saldo = 2500.00;

        System.out.println("*****************************************");
        System.out.println("Dados Iniciais do cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo inicial: R$" + saldo);
        System.out.println("*****************************************");
        System.out.println();

        while (escolha != 4) {
            String menu = """
                    ** Digite sua opcao **
                    1 - Consultar saldo
                    2 - Receber valor
                    3 - Transferir Valor
                    4 - Sair
                    """; // Criamos uma variavel de string em aspas tripla como um template para armazenar o menu

            System.out.println(menu); // Mostranos o menu no console

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite a opcao desejada:");
            escolha = scanner.nextInt();
            System.out.println();

            // Fazemos a comparacao para valores digitados entre 1 e 4, caso nao sera invalido a opcao escolhida
            if(escolha >= 1 && escolha <= 4) {
                // Escolhi fazer com switch pois iria diminuir as linhas de codigo e nao iria fazer tantos if e
                // else

                switch (escolha) {
                    case 1:
                        System.out.println("O saldo atual e: R$" + saldo);
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("Informe o valor a receber?");
                        double receber;
                        receber = scanner.nextDouble();
                        saldo = saldo + receber;
                        System.out.println("Saldo atualizado: R$" + saldo);
                        break;
                    case 3:
                        System.out.println("Informe o valor que deseja transferir?");
                        double transferir;
                        transferir = scanner.nextDouble();
                        if(transferir <= saldo) {
                            saldo = saldo - transferir;
                            System.out.println("Saldo atualizado: R$" + saldo);
                        } else {
                            System.out.println("Nao ha saldo suficiente para fazer essa transferencia");
                        }
                        break;
                    case 4:
                        System.out.println("Voce escolheu sair ... encerrando");
                        System.out.println();
                        break;
                }
            } else System.out.println("Opcao Invalida!"); // Caso nao seja uma opcao valida
        };

        // Ao terminar o looping mostrar a mensagem do inicio.
        System.out.println("*****************************************");
        System.out.println("Dados Iniciais do cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo inicial: R$" + saldo);
        System.out.println("*****************************************");
    }
}