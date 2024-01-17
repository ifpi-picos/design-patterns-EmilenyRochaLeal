public class Director{
    private final Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public Product notebook(){
        return builder
                     .cor("Preto")
                     .armazenamento(512)
                     .memoria(16)
                     .sistemaOperacional("Windows 11")
                     .processador("Intel core i7")
                     .build();
    }
    public Product computador(){
        return builder
                    .cor("Branco")
                    .armazenamento(256)
                    .memoria(8)
                    .sistemaOperacional("Windows 11")
                    .processador("Intel core i5")
                     .build();
    }
    public Product custominizado(String cor, int armazenamento, int memoria, String sistemaOperacional, String processador){
        return builder 
                     .cor(cor)
                     .armazenamento(armazenamento)
                     .memoria(memoria)
                     .sistemaOperacional(sistemaOperacional)
                     .processador(processador)
                     .build();
    }
}
