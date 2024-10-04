public class Main {
    public static void main(String[] args) {
        int[] gas = {1,0,2,3,4,5,5,70};
        int[] cost = {2,0,3,4,3,9,6,2};
        System.out.println(canCompleteCircuit(gas, cost));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
//        Lots faster but not mine
//
//        int[] sum=new int[gas.length+1];
//        int max=Integer.MIN_VALUE;
//        int index=-1;
//        for(int i=gas.length-1;i>=0;i--){
//            sum[i]=sum[i+1]+gas[i]-cost[i];
//            if(max<sum[i]){
//                max=sum[i];
//                index=i;
//            }
//        }
//        if(sum[0]<0) return -1;
//        return index;
//    }

        int totaalGas = 0;
        int totaalCost = 0;
        for (int i = 0; i < gas.length; i++) {
            totaalGas += gas[i];
            totaalCost += cost[i];
        }
        if (totaalCost > totaalGas) {
            return -1;
        }
        boolean toer=false;
        for (int i = 0; i < gas.length; i++) {
            int temp=0;
            for (int j = 0; j <= gas.length; j++) {
                if (gas[i]==0 && cost[i]==0){
                    break;
                }
                if (j==gas.length){
                    j=0;
                }
                if (temp + gas[j]-cost[j]>=0) {
                    if(j==i && toer){
                        return i;
                    }
                    toer=true;
                    temp = temp + gas[j]-cost[j];
                }
                else{
                    i++;
                    j=i-1;
                    temp=0;
                    toer = false;
                }
            }
        }
        return -1;
    }
}