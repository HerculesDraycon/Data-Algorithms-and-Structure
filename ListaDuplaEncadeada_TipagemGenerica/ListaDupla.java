public class ListaDupla <T> {

    private Element head;
    private Element tail;

    public final class Element {

        Object data;
        Element prev, next;

        public Element(T d, Element p, Element n) {
            data = d;
            prev = p;
            next = n;
        }

        public void inserirDepois(T item){

            Element temp = new Element(item, this, next);
            next = temp;

            if(tail.equals(this)){
                tail = next;
            } else {
                temp.next.prev = temp;
            }

        }

        public void inserirAntes(T item){

            Element temp = new Element(item, prev, this);
            prev = temp;

            if(this.equals(head)){
                head = prev;
            } else {
                temp.prev.next = temp;
            }

        }

    }

    public void inserirInicio(T data) {
        
        Element temp = new Element(data, null, head);

        if(head == null){
            tail = temp;
        } else {
            head.prev = temp;
        }

        head = temp;

    }

    public void inserirFim(T data) {
        
        Element temp = new Element(data, tail, null);

        if(head.equals(null)){
            head = temp;
        } else {
            tail.next = temp;
        }

        tail = temp;

    }

    public void imprimir(){

        Element aux = this.head;
        while(aux != null){
            System.out.print("[" + aux.data + "]");
            aux = aux.next;
        }
        System.out.println();

    }

    public void remover(T data) throws ObjetoNaoEncontradoException{

        Element ptr = head;

        while(!ptr.equals(null) && !ptr.data.equals(data)){
            ptr = ptr.next;
        }

        if(ptr.equals(null)){
            throw new ObjetoNaoEncontradoException();
        }

        if(ptr.equals(head)){
            head = ptr.next;
            head.prev = null;
        }else{

            if(ptr.equals(tail)){
                tail = ptr.prev;
                tail.next = null;
            } else {
                (ptr.prev).next = ptr.next;
                (ptr.next).prev = ptr.prev;
            } 

        }


    }

    public int tamanhoLista(){

        int contador = 1;
        Element e = this.head;

        if(e.equals(null)){
            System.out.println("A lista esta vazia");
            return 0;
        }

        while(!e.equals(tail)){
            e = e.next;
            contador++;
        }

        return contador;

    }

    public Element buscarLoc(int pos){

        Element e = head;

        if(pos >= this.tamanhoLista()){
            System.out.println("O indice nao pode ser encontrado nessa lista");
            return null;
        }

        if(e.equals(null)){
            System.out.println("A lista esta vazia");
            return e;
        } else {
            for(int i=0; i<pos; i++){
                e = e.next;
            }
        }

        return e;

    }

}