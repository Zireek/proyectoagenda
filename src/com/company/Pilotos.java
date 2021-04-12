package com.company;

public class Pilotos {
    void mostrar(){
        Titulo titulo = new Titulo();
        titulo.mostrar("PILOTOS");

        System.out.println("44 - Lewis Hamilton");
        System.out.println("77 - Valtteri Bottas");
        System.out.println("16 - Charles Leclerc");
        System.out.println("55 - Carlos Sainz");
        System.out.println("33 - Max Verstappen");
        System.out.println("11 - Sergio Pérez");
        System.out.println("4 - Lando Norris");
        System.out.println("3 - Daniel Ricciardo");
        System.out.println("14 - Fernando Alonso");
        System.out.println("31 - Esteban Ocon");
        System.out.println("10 - Pierre Gasly");
        System.out.println("22 - Yuki Tsunoda");
        System.out.println("5 - Sebastian Vettle");
        System.out.println("18 - Lance Stroll");
        System.out.println("7 - Kimi Raikkonen");
        System.out.println("99 - Antonio Giovinazzi");
        System.out.println("47 - Mick Schumacher");
        System.out.println("9 - Nikita Mazepin");
        System.out.println("63 - George Russell");
        System.out.println("6 - Nicholas Latifi");



        for(añadirPilotos pilotos: Main.arrayNombre.npilotos){
            System.out.println(pilotos.numero + " - " + pilotos.nombre);
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
