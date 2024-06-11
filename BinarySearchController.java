package Controller;

import Modelo.BinarySearchModel;
import View.BinarySearchView;

public class BinarySearchController {
    private BinarySearchModel model;
    private BinarySearchView view;

    public BinarySearchController(BinarySearchModel model, BinarySearchView view) {
        this.model = model;
        this.view = view;
    }

    public void search(int key) {
        int index = model.binarySearch(key);
        view.printResult(index, key);
    }
}
