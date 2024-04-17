public class FilaArray<T> implements Fila<T>{
    
    private T[] array;
    private int head, tail, count;

    public FilaArray(int tam){

        array = (T[]) new Object[tam];
        head = 0;
        tail = tam-1;
        count = 0;

    }

    public void imprimir(){
        for(int i=head; i!=tail; i++){
            System.out.print("[" + array[i] + "]");
        }
        System.out.println();
    }

    public void fazVazia(){

        while(count > 0){
            array[head] = null;
            head++;
            if(head == array.length){
                head = 0;
            }
            count--;
        }

    }

    public boolean estaVazia(){
        return count == 0;
    }

    public T getPrimeiro() throws ContainerVazioException{

        if(count == 0){
            throw new ContainerVazioException();
        }

        return array[head];

    }

    public void enfileirar(T o) throws ContainerCheioException{

        if(count == array.length){
            throw new ContainerCheioException();
        }

        tail++;

        if(tail == array.length){
            tail = 0;
        }

        array[tail] = o;
        count++;

    }

    public T desenfileirar() throws ContainerVazioException{

        if(count == 0){
            throw new ContainerVazioException();
        }

        T result = array[head];
        array[head] = null;
        head++;

        if(head == array.length){
            head = 0;
        }

        return result;

    }

}
