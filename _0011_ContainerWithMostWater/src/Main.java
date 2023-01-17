public class Main {
    public static void main(String[] args) {
        int[] height = {2,3,4,5,18,17,6};
//        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {


//        To slow, time limit exceeded
//        int maximum=0;
//        for (int i = 0; i < height.length; i++) {
//            for (int j = 0; j < height.length; j++) {
//                if (i != j) {
//                    if (Math.min(height[i],height[j])*Math.abs(i-j)>maximum) maximum=Math.min(height[i],height[j])*Math.abs(i-j);
//                }
//            }
//        }
        return maximum;
    }
}

//    int a = height[0];
//    int indexA = 0;
//    int b = height[1];
//    int indexB = 1;
//    int maximum = Math.min(b, a) * Math.abs(indexA - indexB);
//        for (int i = 2; i < height.length; i++) {
//        if (height[i] != 0) {
//
//        if (Math.min(height[i], a) * Math.abs(indexA - i) > maximum) {
//        maximum = Math.min(height[i], a) * Math.abs(indexA - i);
//        }
//        if (Math.min(height[i], b) * Math.abs(indexB - i) >= maximum) {
//        a = b;
//        indexA = indexB;
//        maximum = Math.min(height[i], b) * Math.abs(indexB - i);
//        b = height[indexA + 1];
//        indexB = indexA + 1;
//        }
//        }
//        }