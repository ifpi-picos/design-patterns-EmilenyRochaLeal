public class App {
    public static void main(String[] args) {
        Builder build = new Builder();
        // Instancia um novo Cliente
        Cliente cliente = new Cliente("João", "joao@email.com", new Director(build));
    
        // Tenta comprar um Notebook
        Product notebook = cliente.comprarNotebook();
        System.out.println("Comprou Notebook: " + notebook.toString());
    
        // Tenta comprar um Computador
        Product computador = cliente.comprarComputador();
        System.out.println("Comprou Computador: " + computador.toString());
    
        // Tenta customizar um produto
        Product customizado = cliente.custominizar("Branco", 128, 8, "Ubuntu 22", "Intel Core i5");
        System.out.println("Customizou Produto: " + customizado.toString());
    }
}
