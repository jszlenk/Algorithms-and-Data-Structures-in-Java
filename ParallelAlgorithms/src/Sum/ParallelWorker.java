package Sum;

public class ParallelWorker extends Thread {

	private int[] nums;
	private int low;
	private int high;
	private int partialSum = 0;

	ParallelWorker(int[] numbs, int low, int high) {
		this.nums = numbs;
		this.low = low;
		this.high = Math.min(high, numbs.length);
	}

	int getPartialSum() {
		return partialSum;
	}

	@Override
	public void run() {
		for (int i = low; i < high; i++) {
			partialSum += nums[i];
		}
	}
}
