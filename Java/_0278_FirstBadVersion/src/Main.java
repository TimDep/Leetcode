public class Main {
    public static void main(String[] args) {
        int n =5;
        System.out.println(firstBadVersion(n));
    }

    public static int firstBadVersion(int n) {
        int low=1;
        int high=n;

        while(low<=high){
            int mid=(low+(high-low)/2);
            if(isBadVersion(mid)==false){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
}