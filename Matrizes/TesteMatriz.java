package Matrizes;

public class TesteMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
                { 5, 10, 15 },
                { 2, 4, 6 },
                { 1, 3, 5 }
        };

        int somaDiagonal = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
            somaDiagonal += matriz[i][i];
        }

        System.out.println("Soma da diagonal principal: " + somaDiagonal);
    }
}
