public class ListaEncadeada <T> {

    private Element head;
    private Element tail;

    public ListaEncadeada(){}

    public Element getHead() {return head;}
    public Element getTail() {return tail;}

    public boolean estaVazia(){
        return (head == null);
    }

    public void fazVazia(){
        head = null;
        tail = null;
    }

    public Object getPrimeiro() throws ListaVaziaException {
        if(head == null){
            throw new ListaVaziaException();
        }
        return head.data;
    }

    public Object getUltimo() throws ListaVaziaException {
        if(tail == null){
            throw new ListaVaziaException();
        }
        return tail.data;
    }

    public void inserirInicio(T item){
        Element temp = new Element(item, head);
        if(head == null){
            tail = temp;
        }
        head = temp;
    }

    public void inserirFim(Object item){
        Element temp = new Element(item, null);
        if(head == null){
            head = temp;
        } else {
            tail.next = temp;
        }
        tail = temp;
    }

    public void atribuir(ListaEncadeada<T> l){
        if(l != this){
            this.fazVazia();
            for(Element ptr = l.head; ptr != null; ptr = ptr.next){
                this.inserirFim(ptr.data);
            }
        }
    }

    public void extrair(T item) throws ObjetoNaoEncontradoException {

        Element ptr = head;
        Element prevPtr = null;

        while(ptr != null && !ptr.data.equals(item)){
            prevPtr = ptr;
            ptr = ptr.next;
        }

        if(ptr == null){
            throw new ObjetoNaoEncontradoException();
        }

        if(ptr == head){
            head = ptr.next;
        } else {
            prevPtr.next = ptr.next;
        }

        if(ptr == tail){
            tail = prevPtr;
        }

    }

    public void imprimir(){

        Element aux = this.head;
        while(aux != null){
            System.out.print("[" + aux.data + "]");
            aux = aux.next;
        }
        System.out.println();

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

    public Element buscarLoc(int pos) throws ListaVaziaException{

        Element e = head;

        if(pos > this.tamanhoLista()){
            throw new ListaVaziaException();
        }

        for(int i=0; i<pos; i++){
            e = e.next;
        }
        return e;
    }

    public final class Element {
        
        private Object data;
        private Element next;
    
        Element(Object d, Element n){
            data = d;
            next = n;
        }
    
        public Object getData(){return data;}
        public Object getNext(){return next;}
    
        public void inserirDepois(T item){
    
            next = new Element(item, next);
            if(tail == this){
                tail = next;
            }
    
        }
    
        public void inserirAntes(T item){
    
            Element temp = new Element(item, next);
            if(head == this){
                head = temp;
            } else {
                Element prevPtr = head;
                while(prevPtr != null){
                    prevPtr = prevPtr.next;
                }
                prevPtr.next = temp;
            }
    
        }
    
    }

}