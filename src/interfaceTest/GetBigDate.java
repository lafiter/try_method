package interfaceTest;

import java.util.BitSet;

public class GetBigDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  System.out.println(compute(1000000000*10000));
    }

    private static long compute(int n) {
        if (n < 2) {
            return 0;
        }
        BitSet bitSet = new BitSet(n + 1);
        final int sqrt = (int) Math.sqrt(n);
        long result = 2;
        int index = 3;
        while (index <= n) {
            if (!bitSet.get(index)) {
                result += index;
                int add = index * 2;
                if (index <= sqrt) {
                    for (int temp = index * index; temp <= n; temp += add) {
                        bitSet.set(temp);
                    }
                }
            }
            index += 2;
        }
        return result;
    }

    public static void runTask(String taskName, Runnable runnable) {
        long start = System.currentTimeMillis();
        runnable.run();
        long end = System.currentTimeMillis();
        System.out.printf("task: %s, cost %d ms.\n", taskName, end - start);
    }

}