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
        int Stz=0;
        while(s<=sirina){
            int Sts=1;
            int g = sirina- s;
            int p = g/2+1;
            //če ni s deljiv z 2 nardi presledek pa zvezdico
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
                    //nared da bo sam ena razlika med sts pa stv
                    while(Sts!=Stv){
                        System.out.print("*");
                        Sts++;
                    }
                }
                System.out.println();
            }


            //Stv+=2;
            s++;

        }
    }
}
