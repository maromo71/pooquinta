

public class Teste4 {

    public static void main(String[] args) {
        int opcao = 2;
        System.out.println("1. Soma, 2. Sub, 3. Mult, 4. Sair");
        switch(opcao){
           case 1-> System.out.println("Escolhe soma");
           case 2-> System.out.println("Escolhe sub");
           case 3-> System.out.println("Escolhe mult");
           case 4-> System.out.println("Sair");
           default -> System.out.println("opcao invalida");

        }
    }
}
