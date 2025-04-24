
package personagens;

public abstract class Personagem {
    private String nome;
    private int hp;
    private int ataque;
    private int defesa;

    public Personagem(String nome, int hp, int ataque, int defesa) {
        this.nome = nome;
        this.hp = hp;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public abstract void atacar(Personagem alvo);

    public void receberDano(int dano) {
        int danoFinal = Math.max(dano - this.defesa, 1);
        this.hp -= danoFinal;
        System.out.println(this.nome + " recebeu " + danoFinal + " de dano.");
    }

    public boolean estaVivo() {
        return this.hp > 0;
    }

    public String getNome() { return nome; }
    public int getHp() { return hp; }
    public int getAtaque() { return ataque; }
    public int getDefesa() { return defesa; }

    public void setHp(int hp) { this.hp = hp; }
    public void setAtaque(int ataque) { this.ataque = ataque; }
    public void setDefesa(int defesa) { this.defesa = defesa; }
}
