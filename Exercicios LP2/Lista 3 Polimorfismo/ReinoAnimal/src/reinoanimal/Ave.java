package reinoanimal;
public abstract class  Ave extends Animal { 
    public Ave(String nome) {
        super(nome);
    }

    @Override
    public String getDescricao() {
        return nome + " e um animal, " + nome + " e uma Ave.";
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
