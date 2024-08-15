public class Avatar1 {
    public static void gravata() {
        System.out.println("|>0<|");
    }

    public static void olhos(String size) {
        switch (size) {
            case "pequeno":
                System.out.println(".   .");
                break;
            case "medio":
                System.out.println("o    o");
                break;
            case "grande":
                System.out.println("0    0");
                break;
            default:
                throw new IllegalArgumentException("Tamanho de olho inválido");
        }
    }

    public static void nariz(String shape) {
        switch (shape) {
            case "O":
                System.out.println("  O  ");
                break;
            case "P":
            case "p":
                System.out.println("   P   ");
                break;
            case ">":
                System.out.println("   >   ");
                break;
            default:
                throw new IllegalArgumentException("Tamanho de nariz inválido");
        }
    }

    public static void boca(String expressao) {
        switch (expressao) {
            case "sorriso":
                System.out.println("U==U");
                break;
            case "neutro":
                System.out.println(" ______ ");
                break;
            case "robO":
                System.out.println("||||||");
                break;
            default:
                throw new IllegalArgumentException("Expressão inválida");
        }
    }
}
