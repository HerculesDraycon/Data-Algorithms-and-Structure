public class ListaEncadeada<T> {

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

    public T getPrimeiro() throws ListaVaziaException {
        if(head == null){
            throw new ListaVaziaException();
        }
        return head.data;
    }

    public T getUltimo() throws ListaVaziaException {
        if(tail == null){
            throw new ListaVaziaException();
        }
        return tail.data;
    }

    public void inserirInicio(T item){
        Element temp = new Element(item, head);
        if(head == null){
            tail = temp;
        } else {
            head = temp;
        }
    }

    public void inserirFim(T item){
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

        while(ptr != null && ptr.data != item){
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

    public int tamanho() throws IndexOutOfBoundsException{

        int tamanho = 1;
        Element aux = this.head;
        
        if(aux == null){
            return 0;
        }

        while(aux != tail){
            aux = aux.getNext();
            tamanho++;
        }
        return tamanho;
    }

    public Element buscarElem(int index) throws ListaVaziaException{

        Element e = head;

        if(index > this.tamanho()){
            throw new ListaVaziaException();
        }

        for(int i=0; i<index; i++){
            e = e.getNext();
        }
        return e;
    }

    public final class Element {
        
        private T data;
        private Element next;
    
        Element(T d, Element n){
            data = d;
            next = n;
        }
    
        public T getData(){return data;}
        public Element getNext(){return next;}
    
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

        public boolean ehMenor(T data){
            if(data instanceof Integer){
              return ((Integer)this.data <= (Integer)data);  
            } else if(data instanceof Float){
              return ((Float)this.data <= (Float)data);  
            } else if (data instanceof Double){
              return ((Double)this.data <= (Double)data);  
            } else if (data instanceof String){
              int retorno = (this.data.toString().compareTo(data.toString()));
              return (retorno <= 0);
            } else{
              System.out.println("Tipo não definido");
              return false;
            }
        }
    
    }

}