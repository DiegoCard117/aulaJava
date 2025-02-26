package aulajava;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("Name: ");
        String name = terminalInput.nextLine();
        System.out.println("Seu nome eh: " + name);
        for(int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }
}
