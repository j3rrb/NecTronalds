package NecTronalds;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cardapio {

    private ArrayList<Lanche> lanches = new ArrayList<>();

    public Cardapio(ArrayList<Lanche> l) {
        this.lanches = l;
    }

    public List<String> getLanches() {
        return lanches.stream().map(Lanche::getNome).collect(Collectors.toList());
    }

    public Cardapio adicionarItem(Lanche l) {
        if (l != null) {
            this.lanches.add(l);
        }

        return this;
    }

    public Cardapio removerItem(Lanche l) {
        if (l != null) {
            this.lanches.remove(l);
        }

        return this;
    }

}
