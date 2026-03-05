public class ComputadorTeste {

    public static void main(String[] args) {
        Computador computador = new Computador();
        computador.marca = "HP";
        computador.modelo = "Pavilon";
        computador.cor = "Preta";
        computador.numeroSerie = 123;
        computador.preco = 4000.0;
        computador.imprimir();
        computador.calcularValor();
        computador.imprimir();

        Computador computador2 = new Computador();
        computador2.marca = "IBM";
        computador2.modelo = "Velho";
        computador2.cor = "Preta";
        computador2.numeroSerie = 234;
        computador2.preco = 5000.0;
        computador2.imprimir();
        computador2.calcularValor();
        computador2.imprimir();

        boolean deuCerto = computador2.alterarValor(5500.0);
        if(deuCerto){
            System.out.println("Valor Alterado com sucesso!");
        }else{
            System.out.println("Valor inválido");
        }
        computador2.imprimir();
    }
}
