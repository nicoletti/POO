package exercicio9;

public class Computador extends Data {
    private String nome;
    private String marca;

    public Computador(){
        setNome("");
        setMarca("");
    }

    public Computador setNome(String nome){
        this.nome = nome;
        return this;
    }

    public Computador setMarca(String marca){
        this.marca = marca;
        return this;
    }

    public String toString(){
        return "Nome: " + this.nome +
                "\nMarca: " + this.marca +
                "\nData: " + getDia() + "/" + getMes() + "/" + getAno();
    }

} // Fim classe Computador
