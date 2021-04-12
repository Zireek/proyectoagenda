package com.company;

import jdk.management.jfr.SettingDescriptorInfo;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static arrayNombre arrayNombre = new arrayNombre();
	public static void main(String[] args) {

		entrar entrar = new entrar();
		while(entrar.mostrar()) { }
    }
}