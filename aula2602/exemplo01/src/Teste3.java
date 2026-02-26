public class Teste3 {

    /**
     * Função somar - Realiza a soma de dois valores inteiros
     * @param a Primeiro valor inteiro informado
     * @param b Segundo valor inteiro informado
     * @return Soma dos dois valores passado como argumento
     */
    public static int somar(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        int resultado = somar(5, 3);
        System.out.println(resultado);
    }
}
