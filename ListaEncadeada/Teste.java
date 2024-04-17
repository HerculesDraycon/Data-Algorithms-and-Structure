public class Teste {
    
    public static void main(String[] args) throws Exception {
        
        ListaEncadeada l1 = new ListaEncadeada();
        ListaEncadeada l2 = new ListaEncadeada();

        System.out.println("A lista esta vazia? " + l1.estaVazia()); //Confere se esta vazia e deve retornar true

        l1.inserirFim("Esta");         //Insere o item no fim da lista
        l1.inserirFim("eh");           //Insere o item no fim da lista
        l1.inserirFim("uma");          //Insere o item no fim da lista
        l1.inserirFim("lista");        //Insere o item no fim da lista
        l1.inserirFim("encadeada");    //Insere o item no fim da lista

        System.out.println("A lista esta vazia? " + l1.estaVazia());   //Confere se esta vazia e deve retornar false

        System.out.println("Primeiro elemento da lista: " + l1.getPrimeiro());   //Deve retornar o primeiro elemento da lista
        System.out.println("Ultimo elemento da lista: " + l1.getUltimo());     //Deve retornar o ultimo elemento da lista

        l1.fazVazia();                        //Deve fazer com que a lista volte a ser vazia
        System.out.println("A lista esta vazia? " + l1.estaVazia());   //Confere se a lista esta vazia e deve voltar a retornar true

        l1.inserirInicio(4);    //Insere o item no inicio da lista
        l1.inserirInicio(3);    //Insere o item no inicio da lista
        l1.inserirInicio(2);    //Insere o item no inicio da lista
        l1.inserirInicio(1);    //Insere o item no inicio da lista

        System.out.println(l1.getHead());    //Imprime para onde o head esta apontando na lista
        System.out.println(l1.getTail());    //Imprime para onde o tail esta apontando na lista

        //l1.extrair(4);    //Deve extrair o item passado da lista
        l2.atribuir(l1);
        l2.toString();

    }

}
