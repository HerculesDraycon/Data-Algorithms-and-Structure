public interface ICursor<T> {
    
    T getDado();
    void inserirAntes(T o);
    void inserirDepois(T o);
    void remover() throws ObjetoNaoEncontradoException;

}
