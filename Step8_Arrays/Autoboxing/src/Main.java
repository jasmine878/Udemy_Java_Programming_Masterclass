import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[5];
        int[] intArray = new int[5];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        for (int i = 0; i <=10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

    }
}

