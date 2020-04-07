public class PaintJob {

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

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0 ) return -1;

        double calculatedArea = 0;
        int purchasedBuckets = 0;

        while (area > calculatedArea) {
            purchasedBuckets++;
            calculatedArea += areaPerBucket;
        }

        return purchasedBuckets;
    }
}
