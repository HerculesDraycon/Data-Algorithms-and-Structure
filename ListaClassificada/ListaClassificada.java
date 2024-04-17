public interface ListaClassificada<T>{

    T getElemento(int i);
    boolean ehMembro(T o);
    void inserir(T o);
    void remover(T o) throws ListaVaziaException, ObjetoNaoEncontradoException;
    T procurar(T o);

}