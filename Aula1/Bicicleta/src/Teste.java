public class Teste {
    public static void main(String[] args) {
        Bicicleta b1 = new Bicicleta();
        
        b1.cor = "vermelha";
        b1.marca = "Poti";
        b1.vel = 20;
        
        b1.Acelerar(10);
        
        System.out.println(b1.vel);
    }
}
