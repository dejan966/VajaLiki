package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Vpišite širino: ");
        int s = in.nextInt();
        System.out.println(s);

        int l=1;
        int v = s;
        while(s>=1){

            int stl=0;
            int stc=v;

            /*if(stl<=v){
                if(stl%2!=0){

                }

            }*/
            while(stl!=l){
                System.out.print("*");
                stl++;
            }
            System.out.println();

            s--;
            l++;
        }
    }
}
