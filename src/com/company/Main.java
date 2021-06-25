package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Vpišite širino: ");
        int sirina = in.nextInt();
        System.out.println(sirina);

        int Stv=1;
        int Stz=Stv-1;
        while(Stv<=sirina){
            int Sts=0;
            int g = sirina- Stv;
            int p = g/2+1;
            while(p!=0){
                System.out.print(" ");
                p--;
            }
            while(Sts!=Stv){
                System.out.print("*");
                Sts++;
            }
            Stv+=2;
            System.out.println();
        }
    }
}
