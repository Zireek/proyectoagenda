package com.company;

import java.util.Scanner;

public class entrar {
    boolean mostrar(){

        Titulo titulo = new Titulo();
        titulo.mostrar("ESCUDERIAS F1 2021");

        pantallaMenu  pantallaMenu = new pantallaMenu();
        pantallaMenu.mostrar();

        int hola = Main.scanner.nextInt();

        if (hola == 1) {
            Escuderias escuderias = new Escuderias();
            escuderias.mostrar();

        }

        else if (hola == 2) {

            Pilotos pilotos = new Pilotos();
            pilotos.mostrar();
        }

        else if (hola == 3) {

            Añadir añadir = new Añadir();
            añadir.mostrar();

        }
        else if (hola == 4) {

            Añadir añadir = new Añadir();
            añadir.mostrar2();

        }
        else if (hola == 5) {
            return false;

        }
     return false;
    }
}
