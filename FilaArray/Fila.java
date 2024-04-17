public interface Fila<T>{
    
    void imprimir();
    void fazVazia();
    boolean estaVazia();
    T getPrimeiro() throws ContainerVazioException, ListaVaziaException;
    void enfileirar(T o) throws ContainerCheioException;
    T desenfileirar() throws ContainerVazioException, ListaVaziaException, ObjetoNaoEncontradoException;

}