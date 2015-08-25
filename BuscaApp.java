/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp1.teoria_03.busca;

import java.util.Scanner;

/**
 * Testando se o controlador de versões funciona corretamente!
 * @author 1147148
 */ 
public class BuscaApp {
    public static int indexOf(int[] V, int E) {
        for (int i=0; i<V.length; i++) {
            System.out.println("buscando...");
            if (E==V[i]) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o número de itens: ");
        int n = entrada.nextInt();

        int[] meuVetor = new int[n];
        
        for (int i=0; i<n; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            meuVetor[i] = entrada.nextInt();
        }
        
        System.out.println("");
        System.out.print("Qual valor que deve ser buscado? ");
        int valorBuscado = entrada.nextInt();
        
        int primeiraOcorrencia = indexOf(meuVetor, valorBuscado);
        
        if (primeiraOcorrencia == -1) {
            System.out.println("O valor " + valorBuscado + " não foi encontrado.");
        } else {
            System.out.println("A primeira ocorrência de " + valorBuscado + 
                                " é na posição de índice " + primeiraOcorrencia);
        }
        
    }
}
