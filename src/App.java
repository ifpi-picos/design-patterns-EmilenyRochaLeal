public class App {
    public static void main(String[] args) throws Exception {
       Builder builder = new Builder();
       Director director = new Director(builder);

       Product notebook = director.notebook();
       System.out.println(notebook);

       Product computador = director.computador();
       System.out.println(computador);

       Product pc = director.custominizado("Preto", 256, 16, "Ubuntu", "Intel core  i7");
       System.out.println(pc);
    }
}
