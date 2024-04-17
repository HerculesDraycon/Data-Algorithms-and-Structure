public class ListaClassificadaEncadeada<T> implements ListaClassificada<T>{
    
    private ListaEncadeada<T> lista;
    int count;

    public ListaClassificadaEncadeada(){
        lista = new ListaEncadeada<T>();
        count = 0;
    }

    public int getCount(){return count;}
    public ListaEncadeada<T> getLista(){return lista;}

    public T getElemento(int limite) throws IndexOutOfBoundsException{

        if(limite < 0 || limite >= count){
            throw new IndexOutOfBoundsException();
        }

        ListaEncadeada<T>.Element ptr;
        ptr = lista.getHead();

        for(int i=0; i<limite; i++){
            ptr = ptr.getNext();
        }

        return ptr.getData();

    }

    public boolean ehMembro(T o){

        ListaEncadeada<T>.Element ptr;
        for(ptr=lista.getHead(); ptr!=null; ptr.getNext()){
            if(ptr.getData() == o){
                return true;
            }
        }
        return false;
    }

    public void inserir(T o){
        
        if(lista.estaVazia()){
            lista.inserirInicio(o);
            count++;
        } else {

            ListaEncadeada<T>.Element ptr = lista.getHead();

            while(ptr.getNext() != null && ptr.ehMenor(o)){
                ptr = ptr.getNext();
            }

            if(ptr.getNext() == null && ptr.ehMenor(o)){
                lista.inserirFim(o);
                count++;
            } else {
                Cursor cursor = new Cursor(ptr);
                cursor.inserirAntes(o);
                count++;
            }

        }

    }

    public T procurar(T o){

        ListaEncadeada<T>.Element ptr;

        for(ptr=lista.getHead(); ptr!=null; ptr.getNext()){
            T aux = ptr.getData();
            if(aux.equals(o)){
                return aux;
            }
        }
        return null;
    }

    public void remover(T o) throws ListaVaziaException, ObjetoNaoEncontradoException{

        if(count == 0){
            throw new ListaVaziaException();
        }

        lista.extrair(o);
        count--;

    }

    public class Cursor implements ICursor<T>{
    
        ListaEncadeada<T>.Element elem;
    
        public Cursor(ListaEncadeada<T>.Element e){
            this.elem = e;
        }
    
        public T getDado(){
            return elem.getData();
        }
    
        public void inserirAntes(T o){
            elem.inserirAntes(o);
            count++;
        }
    
        public void inserirDepois(T o){
            elem.inserirDepois(o);
            count++;
        }
    
        public void remover() throws ObjetoNaoEncontradoException{
            lista.extrair(elem.getData());
            count--;
        }
    
    }

}
