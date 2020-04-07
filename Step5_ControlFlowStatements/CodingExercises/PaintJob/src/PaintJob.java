public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));      //expect -1
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));       //expect 3
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));     //expect 3
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <=0 || extraBuckets< 0) return -1;

        double fixedArea = width * height;
        double calculatedArea = extraBuckets * areaPerBucket;
        int purchasedBuckets = 0;

        while (fixedArea > calculatedArea) {
            purchasedBuckets++;
            calculatedArea += areaPerBucket;
        }

        return purchasedBuckets;
    }
}
