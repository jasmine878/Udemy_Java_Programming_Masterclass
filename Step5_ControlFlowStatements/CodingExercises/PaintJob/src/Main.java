public class Main {

    public static void main(String[] args) {
        System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2));      //expect -1
        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5, 2));       //expect 3
        System.out.println(PaintJob.getBucketCount(2.75, 3.25, 2.5, 1));     //expect 3
        System.out.println();

        System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5));         //expect -1
        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5));          //expect 5
        System.out.println(PaintJob.getBucketCount(7.25, 4.3, 2.35));        //expect 14
        System.out.println();

        System.out.println(PaintJob.getBucketCount(3.4, 1.5));           //expect 3
        System.out.println(PaintJob.getBucketCount(6.26, 2.2));          //expect 3
        System.out.println(PaintJob.getBucketCount(3.26, .75));          //expect 5
    }
}
