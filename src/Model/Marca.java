package Model;

public class Marca {

    private int codigo;
    private String nome;

    public Marca(int codigo){
        this.codigo = codigo;

        MarcaDB marcaDB = new MarcaDB();
        marcaDB.conexao();
        this.nome = marcaDB.consultaCodigo(codigo);
        marcaDB.fecha();

    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public static void main(String[] args){

        Marca marca = new Marca(7);

        System.out.println(marca.getNome());

    }

}
