public class de {
    public static void gravata() {
        System.out.println("|><|");
    }
    public static void olhos(String tamanho) {
        switch (tamanho) {
            case "pequeno":
                System.out.println(".   .");
                break;
            case "medio":
                System.out.println("o    o");
                break;
            case "grande":
                System.out.println("O   O");
                break;
            default:
                throw new IllegalArgumentException("tamanho invalido");
        }  
    }

    public static void boca(String forma) {
        switch (forma) {
            case "sorriso":
                System.out.println("U==U");
                break;
            case "neutro":
                System.out.println("_____");
                break;
            case "RobO":
                System.out.println("||||||");
            default:
                throw new IllegalArgumentException("Tamanho de boca invalido");
        }
        
    }
    public static void nariz(String formato){
        switch (formato) {
            case "p":
            case "P":
                System.out.println("  P  ");
                break;
            case ">":
                System.out.println("  >  ");
            case "O":
                System.out.println("   O   ");    
            default:
                throw new IllegalArgumentException("Tamanho de boca invalido");
        }
    }
}
