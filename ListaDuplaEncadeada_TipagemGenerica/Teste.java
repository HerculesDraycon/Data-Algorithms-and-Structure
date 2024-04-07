public class Teste {
    
    public static void main(String[] args){
        
        ListaDupla ld = new ListaDupla();

        ld.inserirInicio(4);     //Insere o int no começo da lista
        ld.inserirInicio(3);     //Insere o int no começo da lista
        ld.inserirInicio(2);     //Insere o int no começo da lista
        ld.inserirInicio(1);     //Insere o int no começo da lista

        ld.inserirFim("Cinco");      //Insere a String no final da lista
        ld.inserirFim("Seis");       //Insere a String no final da lista

        ld.imprimir();        //Imprime o conteudo da lista

        //Remove da lista o objeto passado, cercado com Try Catch para que a Exception nao obstrua a execucao
        try {
            ld.remover(1);
        } catch (ObjetoNaoEncontradoException e) {
            e.printStackTrace();
        }

        ld.imprimir();       //Imprime o conteudo da lista

        //Remove da lista o objeto passado, cercado com Try Catch para que a Exception nao obstrua a execucao
        try {
            ld.remover("Seis");
        } catch (ObjetoNaoEncontradoException e) {
            e.printStackTrace();
        }

        ld.imprimir();       //Imprime o conteudo da lista

        ld.buscarLoc(0).inserirAntes(1); //Faz uma busca e insercao antes do elemento de indice 0 da lista, pondo o 1 novamente
        ld.imprimir();      //Imprime o conteudo da lista

        ld.buscarLoc(4).inserirDepois("Seis"); //Faz uma busca e insercao depois do elemento de indice 4 da lista, pondo o "Seis" novamente
        ld.imprimir();      //Imprime o conteudo da lista
    }

}
