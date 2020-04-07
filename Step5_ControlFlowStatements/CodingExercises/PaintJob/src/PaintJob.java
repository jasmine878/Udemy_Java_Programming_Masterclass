public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));      //expect -1
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));       //expect 3
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));     //expect 3
        System.out.println();

        System.out.println(getBucketCount(-3.4, 2.1, 1.5));         //expect -1
        System.out.println(getBucketCount(3.4, 2.1, 1.5));          //expect 5
        System.out.println(getBucketCount(7.25, 4.3, 2.35));        //expect 14
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets< 0) return -1;

        double fixedArea = width * height;
        double calculatedArea = extraBuckets * areaPerBucket;
        int purchasedBuckets = 0;

        while (fixedArea > calculatedArea) {
            purchasedBuckets++;
            calculatedArea += areaPerBucket;
        }

        return purchasedBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 ) return -1;

        double fixedArea = width * height;
        double calculatedArea = 0;
        int purchasedBuckets = 0;

        while (fixedArea > calculatedArea) {
            purchasedBuckets++;
            calculatedArea += areaPerBucket;
        }

        return purchasedBuckets;
    }
}
