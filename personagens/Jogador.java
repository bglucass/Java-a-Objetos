
package personagens;

public class Jogador extends Personagem {
    private int nivel;
    private int experiencia;

    public Jogador(String nome) {
        super(nome, 100, 15, 5);
        this.nivel = 1;
        this.experiencia = 0;
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println(this.getNome() + " ataca " + alvo.getNome());
        alvo.receberDano(getAtaque());
    }

    public void ganharExperiencia(int xp) {
        this.experiencia += xp;
        if (experiencia >= 20) {
            this.nivel++;
            setHp(getHp() + 20);
            setAtaque(getAtaque() + 5);
            setDefesa(getDefesa() + 2);
            experiencia = 0;
            System.out.println(getNome() + " subiu para o nível " + nivel + "!");
        }
    }
}
