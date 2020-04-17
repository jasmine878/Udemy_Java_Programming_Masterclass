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
        System.out.println();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();

//        for (double dbl = 0.0; dbl <=10.0; dbl+= 0.5) {
//            myDoubleValues.add(Double.valueOf(dbl));
//        }
//
//        for (int i = 0; i < myDoubleValues.size(); i ++) {
//            double value = myDoubleValues.get(i).doubleValue();
//            System.out.println(i + " --> " + value);
//        }

        for (double dbl = 0.0; dbl <=10.0; dbl+= 0.5) {
            myDoubleValues.add(dbl);
        }

        for (int i = 0; i < myDoubleValues.size(); i ++) {
            double value = myDoubleValues.get(i);
            System.out.println(i + " --> " + value);
        }
    }
}

