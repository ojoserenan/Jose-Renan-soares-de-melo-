package reinoanimal;

public abstract class Animal {
    String descricao;
    String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return nome + "e um animal, ";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public abstract void locomover();
    
    public abstract void alimentar();
}
