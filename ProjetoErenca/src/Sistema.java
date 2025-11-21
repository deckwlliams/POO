public class Sistema {
    public static void main(String[] args) {
        Pessoa p= new Pessoa();
        p.setNome("Derick");
        p.setEmail("Derick@gmail.com");
        p.setTelefone( "987654321");

        Estudante e = new Estudante();
        e.setNome("Derick");
        e.setEmail("Derick@gmail.com");
        e.setTelefone( "987654321");
        e.setNumeroMatricula(1);
        e.setCurso( "Software Engineer");
        
        System.out.println(p.Exibir());
    }
}
