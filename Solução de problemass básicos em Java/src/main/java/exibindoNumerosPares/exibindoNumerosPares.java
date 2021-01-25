/*
Desafio

        Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.
        Entrada

        Você receberá 1 valor inteiro N, onde N > 0.
        Saída

        Exiba todos os números pares até o valor de entrada, sendo um em cada linha.
*/

package exibindoNumerosPares;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exibindoNumerosPares {

    public static void main(String[] args) throws IOException {

        String num;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        num = br.readLine();
        for (int i = 2; i <= Integer.parseInt(num); i++) {

            if (i % 2 == 0) {

                System.out.println(i);

            }

        }
    }
}