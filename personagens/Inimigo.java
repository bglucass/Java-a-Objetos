
package personagens;

public class Inimigo extends Personagem {

    public Inimigo(String nome, int nivel) {
        super(nome, 40 + nivel * 10, 10 + nivel * 2, 3 + nivel);
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println(getNome() + " ataca " + alvo.getNome());
        alvo.receberDano(getAtaque());
    }
}
