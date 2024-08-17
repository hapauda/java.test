import java.util.Random;
import java.util.Scanner;


public class consasta {

    private static Scanner scanner = new Scanner(System.in);
    
    public static String NovoNariz() {
        System.out.println("Escolha o tipo de nariz [O], [P], [>] ou será escolhido aleatoriamente: ");
        String formato = scanner.nextLine();
        if (!formato.equals("O") && !formato.equals("O") && !formato.equals("O")){
            String[] options = {"O","P",">"};
            Random rad = new Random();
            formato = options[rad.nextInt(options.length)];
        }
        return formato; 
    }

    public static String olhos() {
        System.out.println("escolha um olho dessas opções [pequeno],[medio],[grande]");
        String tamanho = scanner.nextLine();
        if (!tamanho.equals("pequeno") && !tamanho.equals("medio") && !tamanho.equals("grande"));
        String[] option = {"pequeno","medio","grande"};
        Random rad = new Random();
        tamanho = option[rad.nextInt(option.length)];
 
        return tamanho;
    }

    public static String boca(){
        System.out.println("Selecione um tipo de boca [sorriso],[neutro],[RobO]");
        String forma = scanner.nextLine();
        if (!forma.equals("sorriso") && !forma.equals("neutro") &&!forma.equals("RobO"));
        Random rads = new Random();
        String[] opt = {"neutro","sorriso","RobO"};
        forma = opt[rads.nextInt(opt.length)];
        return forma;
    }

    public static String vai(){
        System.out.println("escolha o lugar da gravata [cabeça],[garganta]");
        String coloco = scanner.nextLine();
        if(!coloco.equals("cabeça") && !coloco.equals("garganta"));
        Random ran = new Random();
        String[] duni = {"cabeça","garganta"};
        coloco = duni[ran.nextInt(duni.length)];
        return coloco;
    }

    public static void main(String[] args) {
        String formato = NovoNariz();
        String tamanho = olhos();
        String coloco = vai(); 
        String forma = boca();

        if (coloco.equals("cabeça")){
            de.gravata();
        }
        de.boca(forma);
        de.olhos(tamanho);
        de.nariz(formato);
        if (coloco.equals("garganta")) {
            de.gravata();
        }
        
        scanner.close();

    }
}
