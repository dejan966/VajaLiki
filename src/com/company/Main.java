package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Vpišite širino: ");
        int sirina = in.nextInt();
        System.out.println(sirina);

        int s = 0;
        int Stv=1;

        while(s<=sirina){
            int Stz=0;
            int g = sirina- s;
            int p = g/2+1;

            if(s%2!=0){
                while(p!=0){
                    System.out.print(" ");
                    p--;
                }
                if(Stv==1){
                    Stv++;
                    System.out.print("*");
                }
                else{
                    //nared da izpiše a koncu še eno zvezdico pa pol še da izpiše še desno stran
                    while(Stz!=Stv){
                        System.out.print("*");
                        Stz++;
                    }
                }
                System.out.println();
            }


            //Stv+=2;
            s++;

        }
    }
}
