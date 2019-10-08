package Sum;

class ParallelSum {

    private ParallelWorker[] sums;
    private int numOfThreads;

    ParallelSum(int numOfThreads) {
        this.sums = new ParallelWorker[numOfThreads];
        this.numOfThreads = numOfThreads;
    }

    int parallelSum(int[] numbs) {

        int size = (int) Math.ceil(numbs.length * 1.0 / numOfThreads);
        int total = 0;

        for (int i = 0; i < numOfThreads; i++) {
            sums[i] = new ParallelWorker(numbs, i * size, (i + 1) * size);
            sums[i].start();
        }

        try {
            for (ParallelWorker sum : sums) {
                sum.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (ParallelWorker sum : sums) {
            total += sum.getPartialSum();
        }

        return total;
    }
}