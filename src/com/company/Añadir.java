package com.company;

import java.util.Scanner;

public class Añadir {
    void mostrar(){

        Titulo titulo = new Titulo();
        titulo.mostrar("AÑADIR ESCUDERIAS: ");

        añadirNombre nombre = new añadirNombre();

        CampoDeTexto campoDeTexto = new CampoDeTexto();

        nombre.nombre = campoDeTexto.pedir("Introduce el nombre de la escuderia", true);

        Main.arrayNombre.nombre.add(nombre);

        System.out.println("Escuderia creada.");

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
    void mostrar2(){

        Titulo titulo = new Titulo();
        titulo.mostrar("AÑADIR PILOTO: ");

        añadirPilotos nombre = new añadirPilotos();

        CampoDeTexto campoDeTexto = new CampoDeTexto();

        nombre.numero = campoDeTexto.pedirNumero("Introduce el numero del piloto");

        nombre.nombre = campoDeTexto.pedir("Introduce el nombre del piloto", true);

        Main.arrayNombre.npilotos.add(nombre);

        System.out.println("Piloto creado.");

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