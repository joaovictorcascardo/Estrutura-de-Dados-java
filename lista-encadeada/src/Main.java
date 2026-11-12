public class Main {
    public static void main(String[] args) {
        ListaEncadeada minhaFila = new ListaEncadeada();

        minhaFila.adicionar(10);
        minhaFila.adicionar(20);
        minhaFila.adicionar(30);

        minhaFila.imprimir();

        System.out.println("Buscar 20: " + minhaFila.buscar(20));
        System.out.println("Tamanho da lista: " + minhaFila.tamanho());
    }
}
