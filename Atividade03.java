import java.util.Random;
import java.util.Scanner;

public class Atividade03 {
    /*
     * Faça um programa para controlar o estoque de mercadorias de uma empresa.
     * Inicialmente, o programa deverá preencher dois vetores com dez posições cada,
     * onde o primeiro corresponde ao código do produto e o segundo, ao total desse
     * produto em estoque. Logo após, o programa deverá ler um conjunto
     * indeterminado de dados contendo o código de um cliente e o código do produto
     * que ele deseja comprar, juntamente com a quantidade. Código do cliente igual
     * a zero indica fim do programa. O programa deverá verificar:
     * ■■ se o código do produto solicitado existe. Se existir, tentar atender ao
     * pedido; caso contrário, exibir
     * mensagem Código inexistente;
     * ■■ cada pedido feito por um cliente só pode ser atendido integralmente. Caso
     * isso não seja possível,
     * escrever a mensagem Não temos estoque suficiente dessa mercadoria. Se puder
     * atendê-lo, escrever
     * a mensagem Pedido atendido. Obrigado e volte sempre;
     * ■■ efetuar a atualização do estoque somente se o pedido for atendido
     * integralmente;
     * ■■ no final do programa, escrever os códigos dos produtos com seus
     * respectivos estoques já atualizados.
     */
    public static void main(String[] args) {
        // Limpa tela
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner ent = new Scanner(System.in);
        Random aleatorio = new Random();
        int[] codigo;
        int[] total;
        codigo = new int[10];
        total = new int[10];
        boolean existe = false;
        int codProd = 0;

        int cliente, produto = 0, quantidade = 0;

        // Preenche o vetor com inteiros aleatórios
        for (int i = 0; i <= 9; i++) {
            codigo[i] = aleatorio.nextInt(1000) + 1;
            total[i] = aleatorio.nextInt(1000) + 1;
        }

        do {
            System.out.print("Insira código do cliente: ");
            cliente = ent.nextInt();
            if (cliente > 0) {
                // Exibe os números gerados
                System.out.println("Códigos dos produtos: ");
                for (int i = 0; i <= 9; i++) {
                    System.out.println(codigo[i]);
                }
                System.out.print("Insira código do produto: ");
                produto = ent.nextInt();
                for (int i = 0; i < total.length; i++) {
                    if (produto == codigo[i]) {
                        existe = true;
                        codProd = i;                        
                    }
                }
                    if (existe){
                        System.out.println("Quantidade dos produtos: ");
                        System.out.println(total[codProd]);
                        System.out.print("Insira quantidade desejada: ");
                        quantidade = ent.nextInt();
                        if (quantidade <= total[codProd]) {
                            System.out.println("Pedido atendido. Obrigado e volte sempre!");
                            total[codProd] -= quantidade;
                        } else {
                            System.out.println("Não temos estoque suficiente dessa mercadoria.");
                        }                              
                } else {
                    System.out.println("Código inexistente");
                }

            }
        } while (cliente > 0);

        for (int i = 0; i <= 9; i++) {
            System.out.println("Código: " + codigo[i] + " - Total: " + total[i]);           
        }
        ent.close();
    }
}
