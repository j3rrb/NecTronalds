package NecTronalds;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Restaurante {

    private String nome;
    private Cardapio cardapio;
    private final ArrayList<Restaurante> restaurantes = new ArrayList<>();
    private Pais pais;

    public Restaurante(String nome, Cardapio c, Pais p) {
        this.nome = nome;
        this.cardapio = c;
        this.pais = p;
    }

    public String getNome() {
        return nome;
    }

    public Restaurante setNome(String nome) {
        this.nome = nome;

        return this;
    }

    public Cardapio getCardapio() {
        return cardapio;
    }

    public Restaurante setCardapio(Cardapio cardapio) {
        this.cardapio = cardapio;
        
        return this;
    }

    public List<String> getRestaurantes() {
        return restaurantes.stream().map(Restaurante::getNome).collect(Collectors.toList());
    }

    public Restaurante setRestaurante(Restaurante r) {
        this.restaurantes.add(r);
        
        return this;
    }

    public Pais getPais() {
        return pais;
    }

    public Restaurante setPais(Pais pais) {
        this.pais = pais;
        
        return this;
    }
}
