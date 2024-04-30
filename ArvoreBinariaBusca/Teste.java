public class Teste{
    public static void main(String[] args) {
        
        Node a1 = new Node<Integer>(1);

        a1.inserirOrdenado(2);
        a1.inserirOrdenado(-1);
        a1.inserirOrdenado(3);
        a1.inserirOrdenado(0);

        a1.imprimeEmOrdem();
        System.out.println();

        a1.imprimeEmPreOrdem();
        System.out.println();

        a1.imprimeEmPosOrdem();
        System.out.println();

        a1.imprimeEmLargura();

    }
}
