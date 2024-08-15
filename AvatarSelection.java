import java.util.Random;
import java.util.Scanner;

public class AvatarSelection {

    private static Scanner scanner = new Scanner(System.in);

    public static String escolherNariz() {
        System.out.print("Escolha o tipo de nariz [O], [P], [>] ou será escolhido aleatoriamente: ");
        String shape = scanner.nextLine();
        if (!shape.equals("O") && !shape.equals("P") && !shape.equals(">")) {
            String[] options = {"O", "P", ">"};
            Random rand = new Random();
            shape = options[rand.nextInt(options.length)];
        }
        return shape;
    }

    public static String escolherOlho() {
        System.out.print("Selecione um tipo de olho [pequeno], [medio], [grande]: ");
        String size = scanner.nextLine();
        if (!size.equals("pequeno") && !size.equals("medio") && !size.equals("grande")) {
            String[] options = {"pequeno", "medio", "grande"};
            Random rand = new Random();
            size = options[rand.nextInt(options.length)];
        }
        return size;
    }

    public static String escolherBoca() {
        System.out.print("Selecione um tipo de expressão [sorriso], [neutro], [robO]: ");
        String expressao = scanner.nextLine();
        if (!expressao.equals("sorriso") && !expressao.equals("neutro") && !expressao.equals("robO")) {
            String[] options = {"sorriso", "neutro", "robO"};
            Random rand = new Random();
            expressao = options[rand.nextInt(options.length)];
        }
        return expressao;
    }

    public static String lugar() {
        System.out.print("Decida qual lugar que vai a gravata [cabeça], [garganta]: ");
        String coloqueLugar = scanner.nextLine();
        if (!coloqueLugar.equals("cabeça") && !coloqueLugar.equals("garganta")) {
            String[] options = {"cabeça", "garganta"};
            Random rand = new Random();
            coloqueLugar = options[rand.nextInt(options.length)];
        }
        return coloqueLugar;
    }

    public static void main(String[] args) {
        String shape = escolherNariz();
        String size = escolherOlho();
        String expressao = escolherBoca();
        String coloque = lugar();

        // Usando funções do avatar1
        if (coloque.equals("cabeça")) {
            Avatar1.gravata();
        }
        Avatar1.olhos(size);
        Avatar1.nariz(shape);
        Avatar1.boca(expressao);
        if (coloque.equals("garganta")) {
            Avatar1.gravata();
        }

        // Fechando o Scanner
        scanner.close();
    }
}
