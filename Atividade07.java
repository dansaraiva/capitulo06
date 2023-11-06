import java.util.Random;

public class Atividade07 {
    /*
     * Faça um programa que preencha um vetor com dez números reais, calcule e
     * mostre a quantidade de números
     * negativos e a soma dos números positivos desse vetor.
     */
    public static void main(String[] args) {
        // Limpa tela
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Random aleatorio = new Random();
        double[] numeros;
        numeros = new double[10];
        int negativos = 0;
        double somaPositivos = 0;

        for (int i = 0; i < 10; i++) {
            numeros[i] = aleatorio.nextDouble();
            if (numeros[i] < 0) {
                negativos++;
            } else {
                somaPositivos += numeros[i];
            }
        }

        //Exibe os números gerados
        for(int i = 0; i < 10 ; i++){
            System.out.println(numeros[i]);          
         }
        System.out.println("Quantidade de números negativos: "+negativos);
        System.out.println("soma dos números positivos: "+somaPositivos);

    }
}
