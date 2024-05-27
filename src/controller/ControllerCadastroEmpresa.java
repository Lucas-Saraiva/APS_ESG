package controller;

// import Model.Empresa;
import Model.EmpresaDB;
// import view.TelaCadastroEmpresa;

public class ControllerCadastroEmpresa {

    // private TelaCadastroEmpresa telaCadastroEmpresa;

    // public ControllerCadastroEmpresa(TelaCadastroEmpresa telaCadastroEmpresa){
    //     this.telaCadastroEmpresa = telaCadastroEmpresa;
    // }

    public void salvarEmpresa(String codigo, String cnpj, String nome, java.util.Date dataInicio, java.util.Date dataFinal, String meta, String indicador ){

        EmpresaDB empresaDB = new EmpresaDB();
        empresaDB.conexao();
        empresaDB.inserir(codigo, nome, cnpj, dataInicio, dataFinal, meta, indicador);
        empresaDB.fecha();

    }

}
