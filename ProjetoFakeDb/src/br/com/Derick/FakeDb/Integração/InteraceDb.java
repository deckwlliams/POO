package br.com.Derick.FakeDb.Integração;

public interface InteraceDb {

    public void conectar(String usuario, String senha);
    public void executar(String comando);
    public void desconectar();

}
