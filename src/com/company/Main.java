package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Vpišite širino: ");
        int v = in.nextInt();
        System.out.println(v);

        int st = 0;

        int Stv=v;
        int Sts=v;
        while(Stv!=0){
            int Stz=0;

            //int g = v- st;
            int p = Stv-1;
            int Stp=1;

            //nek if-else da sproti preverja stanje zvezdic pa presledkov
            while(Stp<Stv){
                System.out.print(" ");
                Stp++;
            }

            //brez while je to sam leva stran zvezdic
            if(Stp<=Sts)
                System.out.print("*");



            System.out.println();
            /*if(p>=0){
                System.out.print(" ");
                Sts++;
                p--;
                if(Sts==4)
                    System.out.println();
            }
            if(Stz<=Stv){
                System.out.print("*");
                Sts++;
                Stz++;
                if(Sts==4)
                    System.out.println();
            }*/


            /*if(s%2!=0){
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
            }*/


            //Stv+=2;
            //v--;
            Stv--;
            Sts++;
        }
    }
}
