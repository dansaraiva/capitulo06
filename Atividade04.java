import java.util.Random;

public class Atividade04 {
    /*
     * Faça um programa que preencha um vetor com quinze elementos inteiros e
     * verifique a existência de elementos iguais a 30, mostrando as posições em que
     * apareceram.
     */
    public static void main(String[] args) {
        // Limpa tela
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Random aleatorio = new Random();
        int[] numeros;
        numeros = new int[15];
        int cont = 0;

        for (int i = 0; i <= 14; i++) {
            numeros[i] = aleatorio.nextInt();
            if (numeros[i] == 30) {
                cont++;
                System.out.println("Número 30 existe na posição: "+i);
            }
        }
        if (cont == 0) {
            System.out.println("Não existe 30 entre os inteiros gerados!");
        }

    }
}
