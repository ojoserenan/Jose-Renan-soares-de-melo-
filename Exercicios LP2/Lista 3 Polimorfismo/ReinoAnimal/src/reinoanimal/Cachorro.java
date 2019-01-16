package reinoanimal;

public class Cachorro extends Mamifero {
    String tipo;

    public Cachorro(String nome, String tipo) {
        super(nome);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "O cachorro " + "se chama "+ nome + " e seu tipo e " +tipo + ".";
    }
    
    @Override
    public void locomover() {
        System.out.println(nome + "esta correndo.");
    }

    @Override
    public void alimentar() {
        System.out.println(nome + "esta comendo racao.");
    } 
}