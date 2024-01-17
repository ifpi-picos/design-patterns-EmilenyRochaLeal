public class Product {
    private String cor;
    private int armazenamento; 
    private int memoria;
    private String sistemaOperacional;
    private String processador;

    public Product(String cor, int armazenamento, int memoria, String sistemaOperacional, String processador) {
        this.cor = cor;
        this.armazenamento = armazenamento;
        this.memoria = memoria;
        this.sistemaOperacional = sistemaOperacional;
        this.processador = processador;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getArmazenamento() {
        return armazenamento;
    }
    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }
    public int getMemoria() {
        return memoria;
    }
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
    public String getSistemaOperacional() {
        return sistemaOperacional;
    }
    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
    public String getProcessador() {
        return processador;
    }
    public void setProcessador(String processador) {
        this.processador = processador;
    }

    @Override
    public String toString(){
        return "Pedido{" +
        "cor='" + cor + '\'' +
        ", armazenamento=" + armazenamento +
        ", memoria=" + memoria +
        ", sistemaOperacional='" + sistemaOperacional + '\'' +
        ", processador='" + processador + '\'' +
        '}'; 
    }
}
