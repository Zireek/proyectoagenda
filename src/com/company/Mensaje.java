
package com.company;

public class Mensaje {
    void mostrarError(String texto){
        printBefore();
        System.out.println("\033[31m" + texto + "\033[0m");
        printAfter();
    }

    void printBefore(){
        System.out.println();
    }

    static void printAfter(){
        System.out.println();
        System.out.println();
    }
}