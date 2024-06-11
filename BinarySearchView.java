package View;
public class BinarySearchView {
    public void printResult(int index, int key) {
        if (index != -1)
            System.out.println("Elemento " + key + " encontrado no índice " + index);
        else
            System.out.println("Elemento " + key + " não encontrado");
    }
}
