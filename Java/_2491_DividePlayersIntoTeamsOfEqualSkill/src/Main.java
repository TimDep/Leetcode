public class Main {
    public static void main(String[] args) {
        int[] skill = {3,2,5,1,3,4};
        System.out.println(dividePlayers(skill));
    }

    public static long dividePlayers(int[] skill) {
        int totalSkill = 0;
        for (int value : skill) {
            totalSkill += value;
        }
        int teamScore = totalSkill / (skill.length / 2);
        long chem = 0;
        int counter = 0;
        if (totalSkill % (skill.length / 2) != 0) {
            return -1;
        } else {
            boolean[] bSkill = new boolean[skill.length];
            for (int j = 0; j < skill.length; j++) {
                if (!bSkill[j]) {
                    bSkill[j] = true;
                    for (int k = j + 1; k < skill.length; k++) {
                        if (!bSkill[k]) {
                            if (skill[j] + skill[k] == teamScore) {
                                bSkill[k] = true;
                                chem += ((long) skill[j] * skill[k]);
                                counter++;
                                break;
                            }
                        }
                    }
                }
            }
            if (counter != skill.length/2){
                return -1;
            }
        }
        return chem;
    }

    //Way faster, double pointers, not mine
//    public long dividePlayers(int[] skill) {
//        Arrays.sort(skill);
//        int left = 0;
//        int right = skill.length - 1;
//        int sum = skill[left] + skill[right];
//        long res = 0;
//        while (left < right){
//            if (skill[left] + skill[right] != sum){
//                return -1;
//            }
//            else{
//                res += (skill[left] * skill[right]);
//            }
//            left ++;
//            right --;
//
//        }
//        return res;
//    }
}