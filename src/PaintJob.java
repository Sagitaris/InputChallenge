public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double areaToCover = width * height;
        double areaToBuy = areaToCover - (areaPerBucket * extraBuckets);
        int bucketsToBuy = (int) Math.ceil((double) (areaToBuy / areaPerBucket));

        return bucketsToBuy;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width,height,areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        return getBucketCount(area, 1, areaPerBucket);
    }

}
