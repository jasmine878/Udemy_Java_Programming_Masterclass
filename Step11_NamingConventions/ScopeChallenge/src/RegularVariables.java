public class RegularVariables {

    public RegularVariables() {

    }

    public void timesTable(int num) {
        System.out.println("Times table for " + num + ": ");
        for (int i = 1;i <= 12; i++) {
            int result = num * i;
            System.out.println(num + " multiplied by " + i + " equals " + result);
        }
        System.out.println("===============================");
    }
}
