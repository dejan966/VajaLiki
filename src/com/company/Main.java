package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Vpišite širino: ");
        int s = in.nextInt();
        System.out.println(s);

        int z=1;
        int v = s;
        while(s!=0){
            int stz=0;
            int g = v-z;
            int u = g/2;
            if(g!=0){
                while(u!=0){
                    System.out.print( " ");
                    u--;
                }
            }
            while(stz!=z){
                if(z%2!=0){
                    System.out.print("*");
                }
                stz++;
            }
            System.out.println();

            s--;
            z++;
        }
    }
}
