package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
         String name = "Felipe";
         String id = "125.855.999-13";
         String years = "28";

        //CRIAÇÃO DA LISTA SEM POO
        //CRIANDO AS VARIAVEIS E CONSTANTES :NAME,ID,YEARS.
        //EXECUTANDO O ARRAYLIST
        //ADD DENTRO DA LISTA PEOPLE QUE FOI CRIADA COM OS VALORES QUE FORAM DADOS
        ArrayList<String>people = new ArrayList<>();

        people.add(name);
        people.add(id);
        people.add(years);

        //COMO CRIAR O FOR EACH
        //APELIDO IDENTIFY E BUSCANDO DENTRO DE PEOPLE OQUE VAI SER LISTADO DENTRO DO PRINTLN

        for (String identify : people){
            System.out.println(identify);
        }

    }
}
