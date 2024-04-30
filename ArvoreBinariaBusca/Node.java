import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Node<T>{

    private T valor;
    private Node<T> filhoEsq, filhoDir;

    public Node(T valor){
        this.valor = valor;
        filhoEsq = null;
        filhoDir = null;
    }

    public Node(T valor, Node<T> nodeEsq, Node<T> nodeDir){
        this.valor = valor;
        filhoEsq = nodeEsq;
        filhoDir = nodeDir;
    }

    public T getValor(){return valor;}
    public Node<T> getFilhoEsq(){return filhoEsq;}
    public Node<T> getFilhoDir(){return filhoDir;}

    public void setValor(T valor){this.valor = valor;}
    public void setNodeEsq(Node<T> nodeEsq){this.filhoEsq = nodeEsq;}
    public void setNodeDir(Node<T> nodeDir){this.filhoDir = nodeDir;}

    public boolean inserirOrdenado(T valor){

        if(valor.toString().compareTo(this.getValor().toString()) < 0){
            if(this.getFilhoEsq() != null){
                return this.getFilhoEsq().inserirOrdenado(valor);
            } else {
                Node<T> n = new Node<T>(valor);
                this.setNodeEsq(n);
                return true;
            }
        } else {
            if(this.getFilhoDir() != null){
                return this.getFilhoDir().inserirOrdenado(valor);
            } else {
                Node<T> n = new Node<T>(valor);
                this.setNodeDir(n);
                return true;
            }
        }

    }

    public void imprimeEmOrdem(){

        if(this.filhoEsq != null){
            this.filhoEsq.imprimeEmOrdem();
        }

        System.out.print(this.valor + " ");

        if(this.filhoDir != null){
            this.filhoDir.imprimeEmOrdem();
        }

    }

    public void imprimeEmPreOrdem(){

        System.out.print(this.valor + " ");

        if(this.filhoEsq != null){
            this.filhoEsq.imprimeEmPreOrdem();
        }

        if(this.filhoDir != null){
            this.filhoDir.imprimeEmPreOrdem();
        }

    }

    public void imprimeEmPosOrdem(){

        if(this.filhoEsq != null){
            this.filhoEsq.imprimeEmPreOrdem();
        }

        if(this.filhoDir != null){
            this.filhoDir.imprimeEmPreOrdem();
        }

        System.out.print(this.valor + " ");

    }

    public void imprimeEmLargura(){

        Queue<Node<T>> f = new ConcurrentLinkedQueue<>();
        f.add(this);

        while(!f.isEmpty()){

            Node<T> n = f.poll();
            System.out.print(n.getValor() + " ");

            if(n.filhoEsq != null){
                f.add(n.filhoEsq);
            }
            if(n.filhoDir != null){
                f.add(n.filhoDir);
            }

        }

    }

}