package Sum;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random random = new Random();
		int numOfProcessors = Runtime.getRuntime().availableProcessors();

		SequentialSum sequentialSum = new SequentialSum();
		ParallelSum parallelSum = new ParallelSum(numOfProcessors);

	    int[] nums = new int[3];

	    for (int i = 0; i < nums.length; i++) {
	        nums[i] = random.nextInt(101) + 1;
	    }

	    long start = System.currentTimeMillis();
	    System.out.println("Sum is: " + sequentialSum.sum(nums));
	    System.out.println("Single: " + (System.currentTimeMillis() - start) + "ms");

	    start = System.currentTimeMillis();
	    System.out.println("Sum is: " +parallelSum.parallelSum(nums));
	    System.out.println("Parallel: " + (System.currentTimeMillis() - start) + "ms");
	}
}
