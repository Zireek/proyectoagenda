package com.company;

import java.util.Scanner;

public class CampoDeTexto {


    String pedir(String prompt) {
        return pedir(prompt, false);
    }

    String pedir(String nombre, boolean obligatiorio) {
        System.out.println("\033[35m" + nombre + ":\033[0m");

        if (!obligatiorio) {
            return Main.scanner.next();
        } else {

            while (true) {
                String texto = Main.scanner.next();

                if (!texto.isEmpty()) {
                    return texto;
                } else {
                    Mensaje mensaje = new Mensaje();
                    mensaje.mostrarError("Introduzca el campo!");
                }
            }
        }

    }

    int pedirNumero(String prompt){
        System.out.println("\033[35m" + prompt + "\033[0m");
        Main.scanner.nextLine();
        while(true) {
            String numero = Main.scanner.nextLine();
            try {
                return Integer.parseInt(numero);
            } catch (Exception e) {
                Mensaje mensaje = new Mensaje();
                mensaje.mostrarError("Introduce un numero");
            }
        }

    }
}