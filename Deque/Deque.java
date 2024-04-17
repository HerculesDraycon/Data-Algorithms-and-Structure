public interface Deque<T>{

    void fazVazia();
    boolean estaVazia();
    T getPrimeiro() throws ListaVaziaException;
    T getUltimo() throws ListaVaziaException;
    void enfileirarInicio(T o);
    void enfileirarFim(T o);
    T desenfileirarInicio() throws ObjetoNaoEncontradoException, ListaVaziaException;
    T desenfileirarFim() throws ObjetoNaoEncontradoException, ListaVaziaException;

}