
package combate;

import personagens.Jogador;
import personagens.Inimigo;

public class Combate {

    public static void iniciar(Jogador jogador, Inimigo inimigo) {
        System.out.println("Combate iniciado entre " + jogador.getNome() + " e " + inimigo.getNome());
        while (jogador.estaVivo() && inimigo.estaVivo()) {
            jogador.atacar(inimigo);
            if (!inimigo.estaVivo()) {
                System.out.println(inimigo.getNome() + " foi derrotado!");
                jogador.ganharExperiencia(10);
                break;
            }

            inimigo.atacar(jogador);
            if (!jogador.estaVivo()) {
                System.out.println(jogador.getNome() + " foi derrotado!");
            }
        }
    }
}
