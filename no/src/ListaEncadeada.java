public class ListaEncadeada {
    No head;

    public ListaEncadeada() {
        this.head = null;
    }

    // Adiciona elemento no final
    public void adicionar(int dado) {
        No novaPessoa = new No(dado);
        if (head == null) {
            head = novaPessoa;
            return;
        }
        No trabalhador = head;
        while (trabalhador.proximo != null) {
            trabalhador = trabalhador.proximo;
        }
        trabalhador.proximo = novaPessoa;
    }

    // Imprime a lista
    public void imprimir() {
        No trabalhador = head;
        while (trabalhador != null) {
            System.out.print(trabalhador.dado + " -> ");
            trabalhador = trabalhador.proximo;
        }
        System.out.println("null");
    }

    // Busca um valor
    public boolean buscar(int valor) {
        No trabalhador = head;
        while (trabalhador != null) {
            if (trabalhador.dado == valor) {
                return true;
            }
            trabalhador = trabalhador.proximo;
        }
        return false;
    }

    // Conta os nós
    public int tamanho() {
        No trabalhador = head;
        int contador = 0;
        while (trabalhador != null) {
            contador++;
            trabalhador = trabalhador.proximo;
        }
        return contador;
    }
}
