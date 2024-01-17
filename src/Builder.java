public class Builder {
    public String cor;
    public int armazenamento; 
    public int memoria;
    public String sistemaOperacional;
    public String processador;

    public Builder cor(String cor){
        this.cor = cor;
        return this;
    }
    public Builder armazenamento(int armazenamento){
        this.armazenamento = armazenamento;
        return this;
    }
    public Builder memoria(int memoria){
        this.memoria = memoria;
        return this;
    }
    public Builder sistemaOperacional(String sistemaOperacional){
        this.sistemaOperacional = sistemaOperacional;
        return this;
    }
    public Builder processador(String processador){
        this.processador = processador;
        return this;
    }
    public Product build(){
        return new Product(cor, armazenamento, memoria, sistemaOperacional, processador);
    }
}
