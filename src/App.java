public class App {
    public static void main(String[] args) {
        Builder build = new Builder();
        Cliente cliente = new Cliente("João", "joao@email.com", new Director(build));
    
        Product notebook = cliente.comprarNotebook();
        System.out.println("Comprou Notebook: " + notebook.toString());
    
        Product computador = cliente.comprarComputador();
        System.out.println("Comprou Computador: " + computador.toString());
    
        Product customizado = cliente.custominizar("Branco", 128, 8, "Ubuntu 22", "Intel Core i5");
        System.out.println("Customizou Produto: " + customizado.toString());
    }
}
