public class Bicicleta {
    String cor;
    String marca;
    int vel;

    public void Acelerar(int aceleracao) {
        vel += aceleracao;
    }

    public void Frear(int aceleracao) {
        vel -= aceleracao;
    }
}
