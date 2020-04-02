public class Main {
    public static void main(String[] args) {
        System.out.println(AreaCalculator.area(5.0));                  //expect 78.53975
        System.out.println(AreaCalculator.area(-1));                   //expect -1
        System.out.println(AreaCalculator.area(5.0, 4.0));      //expect 20.0
        System.out.println(AreaCalculator.area(-1.0, 4.0));     //expect -1
    }
}
