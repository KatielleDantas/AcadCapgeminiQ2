package com.katielledantas.acadcapgeminiq1;

public class Main {
    public static void main(String[] args) {
        Integer nDegraus = 6;
        
        for (int i = nDegraus -1; i >= 0; i--) {
            for (int j = 0; j <= nDegraus -1; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
