import java.util.Random;

/**
 * Faça um programa que preencha um vetor com sete números inteiros, calcule e
 * mostre:
 * ■■ os números múltiplos de 2;
 * ■■ os números múltiplos de 3;
 * ■■ os números múltiplos de 2 e de 3.
 */
public class Atividade02 {

    public static void main(String[] args) {
        //Limpa tela
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        Random aleatorio = new Random();        
        int []numeros;       
        numeros = new int[7];

        //Preenche o vetor com inteiros aleatórios
        System.out.println("Números gerados: ");
        for(int i = 0; i <=6 ; i++){
            numeros[i] = aleatorio.nextInt();            
        }

        //Exibe os números gerados
        for(int i = 0; i <=6 ; i++){
           System.out.println(numeros[i]);          
        }

        //Verifica múltiplos de 2
        System.out.println("Os números múltiplos de 2");
        for (int i = 0; i < 7; i++) {
            if (numeros[i]%2 == 0){
                System.out.println(numeros[i]);
            }
        }
        //Verifica múltiplos de 3
        System.out.println("Os números múltiplos de 3");
        for (int i = 0; i < 7; i++) {
            if (numeros[i]%3 == 0){
                System.out.println(numeros[i]);
            }
        }
        //Verifica múltiplos de 2 e 3
        System.out.println("Os números múltiplos de 2 e 3");
        for (int i = 0; i < 7; i++) {
            if ((numeros[i] % 2 == 0) && (numeros[i] % 3 == 0)){
                System.out.println(numeros[i]);
            }
        }

      
    }
}