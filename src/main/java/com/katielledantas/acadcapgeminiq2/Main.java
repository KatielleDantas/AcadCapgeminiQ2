package com.katielledantas.acadcapgeminiq2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String senha = "!Dd4d";
        Boolean temUmDigito = false;
        Boolean temUmaLetraMinuscula = false;
        Boolean temUmaLetraMaiuscula = false;
        Boolean temUmCaractereEspecial = false;
        
        Character[] listaCaracteresEpeciais = {'!','@','#','$','%','^','&','*','(',')','-','+'};
        
        Integer caracteresMinimosFaltando = 6 - senha.length();
        Integer requisitosExtrasFaltando = 4;
        
        for (int i = 0; i < senha.length(); i++) {    
            if (Character.isUpperCase(senha.charAt(i)) && !temUmaLetraMaiuscula) {
                requisitosExtrasFaltando--;
                temUmaLetraMaiuscula = true;
            }
            if (!Character.isUpperCase(senha.charAt(i)) && !temUmaLetraMinuscula) {
                requisitosExtrasFaltando--;
                temUmaLetraMinuscula = true;
            }
            if (Character.isDigit(senha.charAt(i)) && !temUmDigito) {
                requisitosExtrasFaltando--;
                temUmDigito = true;
            }
            if (Arrays.asList(listaCaracteresEpeciais).contains(senha.charAt(i)) && !temUmCaractereEspecial) {
                requisitosExtrasFaltando--;
                temUmCaractereEspecial = true;
            }
        }
        
        if (caracteresMinimosFaltando >= requisitosExtrasFaltando) {
            System.out.println(caracteresMinimosFaltando);
        } else {
            System.out.println(requisitosExtrasFaltando);
        }
    }
}
