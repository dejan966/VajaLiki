package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Vpišite širino: ");
        int v = in.nextInt();
        System.out.println(v);

        int st = 1;
        int Stv=v;
        int Sts=v;

        while(Stv!=0){
            int OP=2;
            int Stp=1;

            while(Stp<Stv){
                System.out.print(" ");
                Stp++;
            }

            if(Stp<=Sts) //ali Stp<=v
                System.out.print("*");

            if(Stp!=v){
                if(st%2!=0){
                    while(OP!=st){
                        System.out.print(" ");
                        OP++;
                    }
                }
                System.out.print("*");
            }

            System.out.println();

            Stv--;
            Sts++;
            st+=2;
        }
    }
}
