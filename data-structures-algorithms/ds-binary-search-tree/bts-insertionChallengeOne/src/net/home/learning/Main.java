package net.home.learning;

public class Main {
    public static void main(String[] args) {

        Tree intTree = new Tree();

        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);

        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
        intTree.insert(17);

        intTree.insert(28);

        intTree.traverseInOrder();

        System.out.println();
        intTree.traversePreOrder();

        // System.out.println(intTree.get(27));

        //System.out.println("Min value in BST = " + intTree.min());
        //System.out.println("Max value in BST = " + intTree.max());

//        intTree.delete(15);
//        System.out.println();
//        intTree.traverseInOrder();
//
//        intTree.delete(17);
//        System.out.println();
//        intTree.traverseInOrder();
//
//        intTree.delete(25);
//        System.out.println();
//        intTree.traverseInOrder();
//
//        intTree.delete(88);
//        System.out.println();
//        intTree.traverseInOrder();




    }
}