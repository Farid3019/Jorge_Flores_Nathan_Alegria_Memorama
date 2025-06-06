/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import java.util.Random;

/**
 *
 * @author jfflo
 */
public class Logic {

    public int[] getNumeroCartas() {
        int[] numeros = new int[36];
        int contador = 0;
        int nvr = 0;

        while (contador < 36) {
            Random random = new Random();
            int na = random.nextInt(18) + 1;

            for (int i = 0; i < 36; i++) {
                if (numeros[i] == na) {
                    nvr++;
                }

            }
            if (nvr < 2) {
                numeros[contador] = na;
                contador++;
            }
            for (int i = 0; i < 36; i++) {
                System.out.println(numeros[i] + "");
            }

        }
return numeros;
    }
    
}
