package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // CRIANDO AS VARIAVEIS E CONSTANTES
         String name = "Felipe";
         String id = "125.855.999-13";
         String years = "28";

        //CRIANDO O ARRAYLIST SEM POO
        //ADD A LISTA PEOPLE QUE FOI CRIADA AS CONSTANTES E VARIAVEIS A CIMA
        ArrayList<String>people = new ArrayList<>();

        people.add(name);
        people.add(id);
        people.add(years);

        //CRIANDO O FOR EACH
        //ATRIBUINDO AO APELIDO IDENTIFY TUDO QUE A LISTA PEOPLE RECEBEU
        //PRINTANDO TUDO QUE IDENTIFY RECEBEU DE PEOPLE
        for (String identify : people){
            System.out.println(identify);
        }

    }
}
