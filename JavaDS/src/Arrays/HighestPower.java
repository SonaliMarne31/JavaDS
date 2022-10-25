package Arrays;

// For example, given integer N = 24 the answer is 3, 
// because 2^3 = 8 is the highest power of 2 that divides N.


public class HighestPower {
    public int solution(int N) {
        // write your code in Java SE 8
        int result = 0;
		for (int i = 0; i < N / 2; i++) {
			int num = caculatePower(i);
			if (N % num == 0) {
				result = i;
			}
		}
		return result;
    }
    private int caculatePower(final int index) {
		Double d = new Double(Math.pow(2, index));
		return d.intValue();
    }
}
