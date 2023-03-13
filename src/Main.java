import com.estrutura.listacircular.ListaCircular;

public class Main {
    public static void main(String[] args) {

        ListaCircular<String> minhaListaCircular = new ListaCircular<>();

        minhaListaCircular.add("c0");
        minhaListaCircular.add("c1");
        minhaListaCircular.add("c2");
        minhaListaCircular.add("c4");

        System.out.println(minhaListaCircular);
        minhaListaCircular.remove(0);
        minhaListaCircular.remove(0);
        minhaListaCircular.remove(0);
        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular);

    }
}