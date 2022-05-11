package NecTronalds;

public class Lanche {

    private String nome, descricao;
    private float preco;

    public Lanche(String nome, String desc, float preco) {
        this.nome = nome;
        this.descricao = desc;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Lanche setNome(String nome) {
        this.nome = nome;

        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Lanche setDescricao(String descricao) {
        this.descricao = descricao;

        return this;
    }

    public float getPreco() {
        return preco;
    }

    public Lanche setPreco(float preco) {
        this.preco = preco;

        return this;
    }
}
