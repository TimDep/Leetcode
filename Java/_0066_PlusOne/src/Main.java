import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] digits = {9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1]++;
            return digits;
        } else {
            boolean count = true;
            int index = digits.length - 1;
            while(count) {
                if (digits[index] == 9) {
                    digits[index] = 0;
                    if (index == 0) {
                        int[] temp = new int[digits.length + 1];
                        temp[0] = 1;
                        digits = temp;
                        count=false;
                    }
                } else {
                    digits[index] += 1;
                    count = false;
                }
                index--;
            }
        }
        return digits;
    }
}