public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());
        System.out.println();

        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String[] dataArray = stringData.split(" ");

        for (String word : dataArray) {
            list.addItem(new Node(word));
        }

        list.traverse(list.getRoot());
        System.out.println();

        MyLinkedList list2 = new MyLinkedList(null);
        String stringData2 = "5 7 3 9 8 2 1 0 4 6";
        String[] dataArray2 = stringData2.split(" ");

        for (String word : dataArray2) {
            list2.addItem(new Node(word));
        }

        list2.traverse(list2.getRoot());
        System.out.println();
        list2.removeItem(new Node("5"));
        list2.traverse(list2.getRoot());
        list2.removeItem(new Node("3"));
        list2.traverse(list2.getRoot());
        list2.removeItem(new Node("20"));
        list2.traverse(list2.getRoot());
        list2.removeItem(new Node("0"));
        list2.removeItem(new Node("1"));
        list2.removeItem(new Node("2"));
        list2.removeItem(new Node("6"));
        list2.removeItem(new Node("7"));
        list2.removeItem(new Node("8"));
        list2.traverse(list2.getRoot());
        list2.removeItem(list2.getRoot());
        list2.traverse(list2.getRoot());
        list2.removeItem(list2.getRoot());
        list2.traverse(list2.getRoot());
        System.out.println();

        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());
        System.out.println();

        String stringData3 = "5 7 3 9 8 2 1 0 4 6";
        String[] dataArray3 = stringData3.split(" ");

        for (String word : dataArray3) {
            tree.addItem(new Node(word));
        }

        tree.traverse(tree.getRoot());
        System.out.println();

        SearchTree tree2 = new SearchTree(null);
        tree2.traverse(tree2.getRoot());
        System.out.println();

        String stringData4 = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String[] dataArray4 = stringData4.split(" ");

        for (String word : dataArray4) {
            tree2.addItem(new Node(word));
        }

        tree2.traverse(tree2.getRoot());
        System.out.println();
    }
}
