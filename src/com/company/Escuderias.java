package com.company;

import java.util.Scanner;

public class Escuderias {
    void mostrar(){
        Titulo titulo = new Titulo();
        titulo.mostrar("ESCUDERIAS");

        System.out.println("Mercedes");
        System.out.println("Ferrari");
        System.out.println("Red Bull");
        System.out.println("McLaren");
        System.out.println("Alpine");
        System.out.println("AlphaTauri");
        System.out.println("Aston Martin");
        System.out.println("Alfa Romeo");
        System.out.println("Haas");
        System.out.println("Williams");


        for(añadirNombre nombre: Main.arrayNombre.nombre){
            System.out.println(nombre.nombre);
        }
        System.out.println();
        System.out.println();

        System.out.println("volver al menu (s/n):");
        String volver = Main.scanner.next();

        System.out.println();
        System.out.println();

        if (volver.equals("s")){
            entrar entrar = new entrar();
            entrar.mostrar();
        }else {
            System.out.println("da igual que no quieras, si o si voy al menu");

            System.out.println();
            System.out.println();

            entrar entrar = new entrar();
            entrar.mostrar();
        }
    }
}
