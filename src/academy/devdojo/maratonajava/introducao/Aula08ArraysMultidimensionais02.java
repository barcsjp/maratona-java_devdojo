package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        arrayInt[0] = new int[3];
        arrayInt[1] = new int[5];
        arrayInt[2] = new int[2];

        int[][] arrayInt2 = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9, 10, 11}};

        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n-----");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
