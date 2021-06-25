package com.company;

import java.util.Scanner;

public class Karica {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Vpišite širino: ");
        int sirina = in.nextInt();
        System.out.println(sirina);

        if ((sirina % 2) == 0) ++sirina;

        int z = 1;
        int v = sirina;
 
        while (z <= sirina) {
            int stz = 0;
            int g = v-z;
            int u = g/2+1;
    
            while(u!=0){
                System.out.print(" ");
                u--;
            }
            while(stz!=z){
                if(z%2!=0){
                    System.out.print("*");
                }
                stz++;
            }
            System.out.println();

            z = z+2;
        }
        int pres = 0;
        while(z > 0){
            int stz=0;
            int u = pres;
            if(pres!=0){
                while(u!=0){
                    System.out.print(" ");
                    u--;
                }
            }
            while (stz!=z) {
                System.out.print("*");
                stz++;
            }
            System.out.println();

            pres++;

            z = z-2;
        }
    }
}
