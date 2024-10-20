package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Client;

public class Main {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("----------------------");
        System.out.println("Pousada Mediterrâneo");
        System.out.println("----------------------");
        System.out.printf("Quantos quartos você deseja alugar? ");
        int n = sc.nextInt();
        System.out.println();
        
        Client[] array = new Client[10];  
        
        for (int i = 0; i < n; i++) { 
             sc.nextLine();  
             System.out.print("Digite o nome do cliente: ");
             String nome = sc.nextLine();
             
             System.out.print("Digite o código do cliente: ");
             int cod = sc.nextInt();
             
             System.out.print("Quarto desejado (0 a 9): ");
             int quarto = sc.nextInt();
             
             
             if (quarto >= 0 && quarto < array.length && array[quarto] == null) {
                 array[quarto] = new Client(nome, cod, quarto);
             } else {
                 System.out.println("Quarto inválido ou já ocupado.");
                 i--; 
             }
        }
        
        System.out.println();
        System.out.println("Quartos ocupados:");
        System.out.println();
        
        for (int i = 0; i < array.length; i++) {
            if(array[i] != null) {
                System.out.println(array[i].toString());
            }
        }

        sc.close(); 
    }

}

