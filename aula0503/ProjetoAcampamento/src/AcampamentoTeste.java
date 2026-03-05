public class AcampamentoTeste {

    public static void main(String[] args) {
        Acampamento membro =  new Acampamento();
        membro.nome = "Ana Souza";
        membro.idade = 17;
        membro.imprimir(); //antes de separarGrupo
        membro.separarGrupo();
        membro.imprimir(); //depois de separarGrupo
    }
}
