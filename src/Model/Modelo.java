package Model;

public class Modelo {

    private int codigo;
    private Marca marca;
    private String nome;

    public Modelo(int codigo){

        this.codigo = codigo;
        ModeloDB modeloDB = new ModeloDB();
        modeloDB.conexao();
        int codigoMarca = modeloDB.consultaCodigoMarca(codigo);
        this.marca = new Marca(codigoMarca);
        this.setNome(modeloDB.consultaCodigo(codigo));
        modeloDB.fecha();

    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public void setMarca(Marca marca){
        this.marca = marca;
    }

    public Marca getMarca(){
        return this.marca;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public static void main(String[] args){

        Modelo modelo = new Modelo(548);

        System.out.println(modelo.getMarca().getNome());
        System.out.println(modelo.getNome());

    }

}
