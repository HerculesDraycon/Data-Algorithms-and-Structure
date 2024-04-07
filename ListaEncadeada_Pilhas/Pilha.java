public interface Pilha {
    public static void main(String[] args) {

        PilhaArray pilhaArray = new PilhaArray(3);

        System.out.println("A pilha esta vazia? " + pilhaArray.estaVazia());  //Verifica se a pilha esta vazia e deve retornar true

        try {
            pilhaArray.push(1);      //Insere um elemento na pilha
        } catch (ContainerCheioException e) {
            e.printStackTrace();
        }

        try {
            pilhaArray.push(2);      //Insere um elemento na pilha
        } catch (ContainerCheioException e) {
            e.printStackTrace();
        }

        try {
            pilhaArray.push(3);      //Insere um elemento na pilha
        } catch (ContainerCheioException e) {
            e.printStackTrace();
        }

        pilhaArray.imprimir();     //Imprime o conteudo da pilha

        System.out.println("A pilha esta vazia? " + pilhaArray.estaVazia());  //Verfifica se a pilha esta vazia e deve retornar false

        try {
            System.out.println(pilhaArray.getTop());    //Pega o elemento no topo da pilha
        } catch (ContainerVazioException e) {
            e.printStackTrace();
        }

        try {
            pilhaArray.pop();
        } catch (ContainerVazioException e) {
            e.printStackTrace();
        }

        pilhaArray.imprimir();   //Imprime o conteudo da pilha

        pilhaArray.fazVazia();   //Torna a pilha vazia novamente
        System.out.println("A pilha esta vazia? " + pilhaArray.estaVazia());  //Verfifica se a pilha esta vazia e deve retornar true

    }
}
