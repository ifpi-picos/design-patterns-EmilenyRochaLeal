public class Cliente {
    private String nome;
    private String email;
    private Director director;

    Cliente (String nome, String email, Director director){
        this.nome = nome;
        this.email = email;
        this.director = director;
    }

    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }

    public Product comprarNotebook(){
        return director.notebook();
    }
    public Product comprarComputador(){
        return director.computador();
    }
    public Product custominizar(String cor, int armazenamento, int memoria, String sistemaOperacional, String processador){
        return director.custominizado(cor, armazenamento, memoria, sistemaOperacional, processador);
    }
}
