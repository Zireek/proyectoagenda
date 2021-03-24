package com.company;

import jdk.management.jfr.SettingDescriptorInfo;

import java.util.Scanner;

public class Main {

	public static Scanner scanner;

	public static void main(String[] args) {
		Titulo titulo = new Titulo();
		titulo.mostrar();

		// Clase objeto = new Clase();
		Pantalla pantalla = new Pantalla();
		pantalla.mostrar();

		Escuderias escuderias = new Escuderias();
		escuderias.mostrar();

		Pilotos pilotos = new Pilotos();
		pilotos.mostrar();

    }
}
//