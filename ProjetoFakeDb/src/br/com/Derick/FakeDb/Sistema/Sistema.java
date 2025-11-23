package br.com.Derick.FakeDb.Sistema;

import br.com.Derick.FakeDb.Integração.Fabricantes.MySQlDb;
import br.com.Derick.FakeDb.Integração.InteraceDb;

public class Sistema {
    public static void main(String[] args) {
        InteraceDb idb;

        idb = new MySQlDb();
        idb.conectar("admin", "1234");
        idb.executar("Select * from users where username = 'admin'");
        idb.desconectar();

    }
}
