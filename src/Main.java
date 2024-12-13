import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int pontos = 0;
        List<Integer> acertos = new ArrayList<>();
        List<Integer> erros = new ArrayList<>();

        while (true) {
            System.out.println("Escolha a dificuldade:");
            System.out.println("1 - Fácil (1-10)");
            System.out.println("2 - Médio (1-50)");
            System.out.println("3 - Difícil (1-100)");
            int dificuldade = scanner.nextInt();
//criando os lacos com os graus de difuldade.
            int intervalo = 10;
            if (dificuldade == 2) {
                intervalo = 50;

            } else if (dificuldade == 3) {
                intervalo = 100;
            }

            int numeroSorteado = random.nextInt(intervalo) + 1;

            System.out.println("Digite seu palpite (1-" + intervalo + "): ");
            int palpite = scanner.nextInt();

            // criando a condição para o usuário digitar na tela e receber o resultado .
            if (palpite == numeroSorteado) {
                pontos += 10;
            }
        }


    }
}