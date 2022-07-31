package Strings;

public class StrongPasswordChecker {
    
    public static int strongPasswordChecker(String s) {
        int res = 0, lowercase = 1, uppercase = 1, digits = 1;
        char[] charArr = s.toCharArray();
        int[] arr = new int[charArr.length];

        for (int i = 0; i < arr.length;) {
            // Check -It contains at least one lowercase letter, at least 
            // one uppercase letter, and at least one digit.
            if (Character.isLowerCase(charArr[i])) lowercase = 0;
            if (Character.isUpperCase(charArr[i])) uppercase = 0;
            if (Character.isDigit(charArr[i])) digits = 0;

            int j = i;
            // Now check for sequential chars, hence we incr i until no match is found
            while (i < charArr.length && charArr[i] == charArr[j]) i++;
            // add now many repeats we have
            arr[j] = i - j;
        }

        int total_missing = (lowercase + uppercase + digits);

        if (arr.length < 6) {
            res += total_missing + Math.max(0, 6 - (arr.length + total_missing));

        } else {
            int over_len = Math.max(arr.length - 20, 0), left_over = 0;
            res += over_len;

            for (int k = 1; k < 3; k++) {
                for (int i = 0; i < arr.length && over_len > 0; i++) {
                    if (arr[i] < 3 || arr[i] % 3 != (k - 1)) continue;
                    arr[i] -= Math.min(over_len, k);
                    over_len -= k;
                }
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 3 && over_len > 0) {
                    int need = arr[i] - 2;
                    arr[i] -= over_len;
                    over_len -= need;
                }

                if (arr[i] >= 3) left_over += arr[i] / 3;
            }

            res += Math.max(total_missing, left_over);
        }
        
        return res;
    }

    public static void main(String args[]) {
        int res = StrongPasswordChecker.strongPasswordChecker("1337C0d3");
        System.out.println(res);
    } 
}
