public class Teste {
    public static void main(String[] args) throws ListaVaziaException {
        
        ListaClassificadaEncadeada<Integer> listaIn = new ListaClassificadaEncadeada<>();
        ListaClassificadaEncadeada<Double> listaDb = new ListaClassificadaEncadeada<>();
        ListaClassificadaEncadeada<Float> listaFl = new ListaClassificadaEncadeada<>();
        ListaClassificadaEncadeada<String> listaStr = new ListaClassificadaEncadeada<>();

        listaIn.inserir(8);
        listaIn.inserir(20);
        listaIn.inserir(10);
        listaIn.inserir(1);

        listaDb.inserir(8.4);
        listaDb.inserir(8.44);
        listaDb.inserir(8.43999);
        listaDb.inserir(6.15);

        listaFl.inserir(0.851f);
        listaFl.inserir(0.85f);
        listaFl.inserir(0.852f);
        listaFl.inserir(0.84898f);

        listaStr.inserir("aaab");
        listaStr.inserir("a");
        listaStr.inserir("bbaabb");
        listaStr.inserir("baa");

        for(int i=0; i<listaIn.getCount(); i++){
            System.out.print("[" + listaIn.getLista().buscarElem(i) + "]");
        }
        System.out.println();
        for(int i=0; i<listaDb.getCount(); i++){
            System.out.print("[" + listaDb.getLista().buscarElem(i) + "]");
        }
        System.out.println();
        for(int i=0; i<listaFl.getCount(); i++){
            System.out.print("[" + listaFl.getLista().buscarElem(i) + "]");
        }
        System.out.println();
        for(int i=0; i<listaStr.getCount(); i++){
            System.out.print("[" + listaStr.getLista().buscarElem(i) + "]");
        }

    }
}
