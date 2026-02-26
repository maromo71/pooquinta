public class Teste2 {
    public static void main(String[] args) {
        //Fazer conversao de tipos  de dados
        String strValor = "15.5";
        //Convertendo String para double
        double valor = Double.parseDouble(strValor);

        /*
         uma
         duas
         tres
         */
        double resultado = 2 * valor;
        System.out.println(resultado);

        String strResultado = Double.toString(resultado);
        System.out.println("Resultado: '" + strResultado + "' como texto");
        float x = (float)5 / 2;
        System.out.println(x);
    }
}
