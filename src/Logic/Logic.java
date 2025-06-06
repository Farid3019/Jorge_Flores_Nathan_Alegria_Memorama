/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import java.util.Random;

/**
 *
 * @author Dark
 */
public class Logic {
    
    public int[] getNumeroCartas() {
        
        int[] numbers = new int[36];
        int count = 0;
        
        while(count < 16) {
            Random r = new Random();
            int na = r.nextInt(18) + 1;
            int nvr = 0;
            
            for (int i = 0; i < 36; i++) {
                if(numbers[i] == na) {
                    nvr++;
                }
            }
            if(nvr < 2) {
                numbers[count] = na;
                count++;
            }
            
        }
        
        
        return numbers;
    }
            
}