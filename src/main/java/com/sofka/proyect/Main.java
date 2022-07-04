package com.sofka.proyect;

import java.util.Scanner;

/**
 * This function get information and shows it in the console.
 *
 * @author Daniel David Cardona Moreno
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String name = scanner.nextLine();
        System.out.println("Ingrese su celular");
        String cel = scanner.nextLine();
        System.out.println("Ingrese su edad");
        Integer age = scanner.nextInt();

        System.out.println("Bienvenido señor " + name + ", es un placer para nosotros contar " +
                "con una persona de edad " + age + "años.");

        System.out.println("Próximamente nos comunicaremos con usted al numero " + cel + ".");
        System.out.println("Feliza día");
    }
}
