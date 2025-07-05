import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Carro carroJeep = new Carro();
        int opcao;

        do {
            System.out.println("Digite a opção desejada:");
            System.out.println("1- Ligar o carro");
            System.out.println("2- Desligar o carro");
            System.out.println("3- Acelerar");
            System.out.println("4- Diminuir");
            System.out.println("5- Virar para esqueda");
            System.out.println("6- Virar para direita");
            System.out.println("7- Verificar velocidade");
            System.out.println("8- Trocar a marcha");
            System.out.println("0- Sair");

            opcao = scanner.nextInt();

            switch (opcao){
                case 1 -> carroJeep.ligarCarro();
                case 2 -> carroJeep.desligarCarro();
                case 3 -> carroJeep.acelerarCarro();
                case 4 -> carroJeep.diminuirVelocidade();
                case 5 -> carroJeep.virarEsquerda();
                case 6 -> carroJeep.virarDireita();
                case 7 -> carroJeep.verificarVelocidade();
                case 8 -> {
                    System.out.println("Entre com a nova marcha:");
                    int novaMarcha = scanner.nextInt();
                    carroJeep.trocarMarcha(novaMarcha);
                }
                case 0 -> System.out.println("Fim acesso");
                default -> System.out.println("Opção inválida");
            }

        }while (opcao != 0);


        }
    }
