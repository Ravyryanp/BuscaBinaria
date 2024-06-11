package Busca;

import Controller.BinarySearchController;
import Modelo.BinarySearchModel;
import View.BinarySearchView;

public class Busca {
    public static void main(String[] args) {
        int[] sortedArray = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        BinarySearchModel model = new BinarySearchModel(sortedArray);
        BinarySearchView view = new BinarySearchView();
        BinarySearchController controller = new BinarySearchController(model, view);

        int key = 16;
        controller.search(key);
    }
}
