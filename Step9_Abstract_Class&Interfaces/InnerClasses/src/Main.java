public class Main {
    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);
//        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
//        System.out.println(first.driveSpeed(1000));

//        mcLaren.addGear(1, 5.3);                      //equals 5.3 * 1
//        mcLaren.addGear(2, 10.6);                     //equals 5.3 * 2
//        mcLaren.addGear(3, 15.9);                     //equals 5.3 * 3
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        System.out.println();

        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(1000));
        System.out.println();

        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));
    }
}
