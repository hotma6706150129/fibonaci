/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonnaci;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Fibonnaci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner show = new Scanner (System.in);
        System.out.print("Masukkan Jumlah Deret Fibonacci : ");
        System.out.print("Agni Oktaviani: ");
        int n = show.nextInt();
        long fib[] = new long[n];
        
        fib[0]=0;
        fib[1]=1;
        for(int i = 2; i<n; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        for (int i=0; i<n; i++){
            System.out.print(fib[i]+ " ");
        }
    }
    
}
