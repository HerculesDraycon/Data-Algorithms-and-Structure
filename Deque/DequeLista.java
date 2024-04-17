public class DequeLista<T> implements Deque<T>{
   
    private ListaEncadeada<T> lista;
    private int count;

    public DequeLista() {
        lista = new ListaEncadeada<>();
        count = 0;
    }

    public void fazVazia(){
        lista.fazVazia();
        count = 0;
    }

    public boolean estaVazia(){
        return count == 0;
    }

    public ListaEncadeada<T> getLista(){return lista;}

    public T getPrimeiro() throws ListaVaziaException{

        if(count == 0){
            throw new ListaVaziaException();
        }

        return lista.getPrimeiro();

    }

    public T getUltimo() throws ListaVaziaException{

        if( count == 0){
            throw new ListaVaziaException();
        }

        return lista.getUltimo();               
        
    }

    public void enfileirarInicio(T o){
        lista.inserirInicio(o);
        count++;
    }

    public void enfileirarFim(T o){
        lista.inserirFim(o);
        count++;
    }

    public T desenfileirarInicio() throws ObjetoNaoEncontradoException, ListaVaziaException{
        
        if(count == 0){
            throw new ListaVaziaException();
        }

        T result = lista.getPrimeiro();
        lista.extrair(result);
        count--;
        return result;

    }

    public T desenfileirarFim() throws ObjetoNaoEncontradoException, ListaVaziaException{

        if(count == 0){
            throw new ListaVaziaException();
        }

        T result = lista.getUltimo();
        lista.extrair(result);
        count--;
        return result;

    }



}
