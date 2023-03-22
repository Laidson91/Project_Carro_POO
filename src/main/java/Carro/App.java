package Carro;

public class App {
    

    public static void main(String[] args) {
         Carro meufusca = new Carro  (8);
         meufusca.addGasolina(50);
         System.out.println(meufusca.toString());
         meufusca.andar(300);
         System.out.println(meufusca.toString());
    }
}
