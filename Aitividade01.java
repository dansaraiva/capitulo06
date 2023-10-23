import java.util.Scanner;

/**
 * Faça um programa que preencha um vetor com seis elementos numéricos inteiros.
 * Calcule e mostre:
 * ■■ todos os números pares;
 * ■■ a quantidade de números pares;
 * ■■ todos os números ímpares;
 * ■■ a quantidade de números ímpares.
 */
public class Aitividade01 {
    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        int []numeros;
        int contaPar = 0, contaImpar = 0;
        numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Informe um número: ");
            numeros[i] = ent.nextInt();
            if (numeros[i] %2 ==0) {
                contaPar++;
            }else{
                contaImpar++;
            }
        }
        System.out.println("Números pares: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }
        System.out.println("Números ímpares: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 1) {
                System.out.println(numeros[i]);
            }
        }
        System.out.println("Quantidade par: "+contaPar);
        System.out.println("Quantidade ímpar: "+contaImpar);

        ent.close();
    }
}