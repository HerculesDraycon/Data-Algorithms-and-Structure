public class FilaEncadeada<T> implements Fila<T>{
    
    private ListaEncadeada<T> lista;
    private int count;

    public FilaEncadeada(){
        lista = new ListaEncadeada<T>();
        count = 0;
    }

    public void fazVazia(){
        lista.fazVazia();
        count = 0;
    }

    public boolean estaVazia(){
        return count == 0;
    }

    public T getPrimeiro() throws ListaVaziaException{

        if(count == 0){
            throw new ListaVaziaException();
        }
        return lista.getPrimeiro();
    }

    public void enfileirarLista(T o){
        lista.inserirFim(o);
        count++;
    }

    public T desenfileirar() throws ListaVaziaException, ObjetoNaoEncontradoException{

        if(count == 0){
            throw new ListaVaziaException();
        }

        T result = lista.getPrimeiro();
        lista.extrair(result);
        count--;
        return result;

    }

    @Override
    public void imprimir() {
        throw new UnsupportedOperationException("Unimplemented method 'imprimir'");
    }

    @Override
    public void enfileirar(T o) throws ContainerCheioException {
        throw new UnsupportedOperationException("Unimplemented method 'enfileirar'");
    }

}
