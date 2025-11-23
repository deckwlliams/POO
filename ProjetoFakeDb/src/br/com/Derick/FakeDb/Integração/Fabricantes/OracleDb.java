package br.com.Derick.FakeDb.Integração.Fabricantes;

import br.com.Derick.FakeDb.Integração.InteraceDb;

public class OracleDb implements InteraceDb {
    @Override
    public void executar(String comando) {
        System.out.println("<Oracle>"+comando);
    }
    @Override
    public void desconectar() {
        System.out.println("Desconectando com o SQL");
    }
    @Override
    public void conectar(String usuario, String senha) {
        System.out.println("Conneting on Oracle with" + usuario + ":" + senha);
    }
}
