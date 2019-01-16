package reinoanimal;
public abstract class Mamifero extends Animal { 
    public Mamifero(String nome) {
        super(nome);
    }
    @Override
    public String getDescricao() {
        return nome + " e um animal, " + nome + " e um mamifero.";
    }
    @Override
    public String getNome() {
        return nome + " é animal";
    }
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public abstract void locomover();
    @Override
    public abstract void alimentar();
}
