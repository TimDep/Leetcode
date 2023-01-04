import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] tasks = {1,2,1};
        System.out.println(minimumRounds(tasks));
    }

    public static int minimumRounds(int[] tasks) {
        if (tasks.length==1){
            return -1;
        }
        Arrays.sort(tasks);
        int cijfer = tasks[0];
        int index = 0;
        int[] taken = new int[tasks.length];
        int teller=1;
        for (int i =1; i<tasks.length; i++){
            if (cijfer==tasks[i] && i==tasks.length-1){
                teller++;
                taken[index]=teller;
            }
            if (cijfer==tasks[i]){
                teller++;
            }
            else if (teller==1){
                return -1;
            }
            else {
                taken[index]=teller;
                index++;
                teller=1;
                cijfer=tasks[i];
                if (i== tasks.length-1){
                    taken[index]=teller;
                }
            }
        }
        teller=0;
        for (int j : taken) {
            if (j == 1) {
                return -1;
            } else if (j % 3 == 0) {
                teller += j / 3;
            } else {
                teller += j / 3 + 1;
            }
        }
        return teller;
    }
}
//      faster and better memory NOT MINE

//    HashMap<Integer,Integer> map=new HashMap<>();
//    int count=0;
//
//      for(int i=0;i<tasks.length;i++)
//        map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
//
//        for(Map.Entry<Integer,Integer> entry: map.entrySet())
//        {
//        int temp=entry.getValue();
//        if(temp==1) return -1;
//        else if(temp%3==0) count+=temp/3;
//        else count+=temp/3+1;
//        }
//
//        return count;
//        }