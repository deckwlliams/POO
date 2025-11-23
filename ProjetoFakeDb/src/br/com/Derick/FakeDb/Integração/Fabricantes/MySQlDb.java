package br.com.Derick.FakeDb.Integração.Fabricantes;

import br.com.Derick.FakeDb.Integração.InteraceDb;

public class MySQlDb implements InteraceDb {
    @Override
    public void conectar(String usuario, String senha) {
        System.out.println("Conectando com o SQL" +  usuario + ":" + senha);
    }

    @Override
    public void executar(String comando) {
System.out.println("Executando com o SQL" +  comando);
    }

    @Override
    public void desconectar() {
System.out.println("Desconectando com o SQL");
    }
}
