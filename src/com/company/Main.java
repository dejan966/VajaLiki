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
        while(s>=1){
            int stz=0;
            int p = s;
            if(v-z!=0)
                System.out.print( " ");

            while(stz!=z){
                if(z%2!=0){
                    int g = p/2;

                    /*while(p>1){

                        if(g==p/2){


                        }
                        p--;
                    }*/
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
