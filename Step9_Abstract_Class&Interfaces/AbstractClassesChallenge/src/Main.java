public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.traverse(list.getRoot());
        System.out.println();

        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String[] dataArray = stringData.split(" ");

        for (String word : dataArray) {
            list.addItem(new Node(word));
        }
        
        list.traverse(list.getRoot());
        System.out.println();

      
    }


}
