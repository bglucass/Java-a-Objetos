
import personagens.Jogador;
import personagens.Inimigo;
import combate.Combate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao RPG Terminal!");
        System.out.print("Digite o nome do seu personagem: ");
        String nome = sc.nextLine();

        Jogador jogador = new Jogador(nome);
        Inimigo[] inimigos = {
            new Inimigo("Goblin", 1),
            new Inimigo("Orc", 2)
        };

        for (Inimigo inimigo : inimigos) {
            Combate.iniciar(jogador, inimigo);
            if (!jogador.estaVivo()) break;
        }

        if (jogador.estaVivo()) {
            System.out.println("Você venceu todos os inimigos!");
        } else {
            System.out.println("Game Over.");
        }

        sc.close();
    }
}
