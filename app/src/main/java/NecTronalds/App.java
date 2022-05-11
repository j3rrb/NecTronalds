package NecTronalds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        ArrayList<Restaurante> restaurantes = new ArrayList<>();
        
        Pais p1 = new Pais("Brasil");
        Pais p2 = new Pais("Argentina");
        Pais p3 = new Pais("EUA");
        Pais p4 = new Pais("Japão");

        Lanche l1 = new Lanche("NecFeijoada", "a", 1);
        Lanche l2 = new Lanche("NecBacon", "a", 2);
        Lanche l3 = new Lanche("NecAcarajé", "a", 3);
        Lanche l4 = new Lanche("NecPicanha", "a", 4);
        Lanche l5 = new Lanche("NecChimichurri", "a", 5);
        Lanche l6 = new Lanche("NecCheddar", "a", 6);
        Lanche l7 = new Lanche("NecSushi", "a", 7);

        ArrayList<Lanche> l_p1 = new ArrayList<>();
        l_p1.add(l1);
        l_p1.add(l2);
        l_p1.add(l3);
        l_p1.add(l4);
        
        ArrayList<Lanche> l_p2 = new ArrayList<>();
        l_p2.add(l4);
        l_p2.add(l5);

        Cardapio c_p1 = new Cardapio(l_p1);
        Cardapio c_p2 = new Cardapio(l_p2);
        Restaurante r_p1 = new Restaurante("Restaurante BR", c_p1, p1);
        Restaurante r_p2 = new Restaurante("Restaurante Arg", c_p2, p2);
        restaurantes.add(r_p1);
        restaurantes.add(r_p2);
        
        System.out.println("País de " + r_p1.getNome() + ": " + r_p1.getPais().getNome() + "\n");
        System.out.println("Cardápio de " + r_p1.getNome() + ": " + r_p1.getCardapio().getLanches().toString() + "\n");
        System.out.println("Restaurantes de " + r_p1.getNome() + ": " + r_p1.getRestaurantes().toString() + "\n");  
        System.out.println("=================================");
        System.out.println("País de " + r_p2.getNome() + ": " + r_p2.getPais().getNome() + "\n");
        System.out.println("Cardápio de " + r_p2.getNome() + ": " + r_p2.getCardapio().getLanches().toString() + "\n");
        System.out.println("Restaurantes de " + r_p2.getNome() + ": " + r_p2.getRestaurantes().toString() + "\n"); 
        
        c_p1.removerItem(l1);
        c_p2.removerItem(l5);
        
        Cardapio c_rand = new Cardapio(l_p1);
        Restaurante r_rand = new Restaurante("Restaurante Random", c_rand, p1);
        restaurantes.add(r_rand);        
        
        r_p1.setRestaurante(r_rand);
        
        System.out.println("País de " + r_p1.getNome() + ": " + r_p1.getPais().getNome() + "\n");
        System.out.println("Cardápio de " + r_p1.getNome() + ": " + r_p1.getCardapio().getLanches().toString() + "\n");
        System.out.println("Restaurantes de " + r_p1.getNome() + ": " + r_p1.getRestaurantes().toString() + "\n");
        System.out.println("=================================");
        System.out.println("País de " + r_p2.getNome() + ": " + r_p2.getPais().getNome() + "\n");
        System.out.println("Cardápio de " + r_p2.getNome() + ": " + r_p2.getCardapio().getLanches().toString() + "\n");
        System.out.println("Restaurantes de " + r_p2.getNome() + ": " + r_p2.getRestaurantes().toString() + "\n"); 
        
        System.out.println("Mostrando cardápio de todos os países: \n");
        
        for (Restaurante rest : restaurantes) {
            System.out.println(rest.getCardapio().getLanches());
        }
        
        System.out.println("\nMostrando cardápio de um países específico: \n");
        System.out.print("Digite o nome de um país: ");
        Scanner sc = new Scanner(System.in);
        String paisNome = sc.nextLine();
        
        for (Restaurante rest : restaurantes) {
            if (rest.getPais().getNome().equals(paisNome)) {
                System.out.println(rest.getCardapio().getLanches());
            }
        }
        
        System.out.println("\n");
    }
}
