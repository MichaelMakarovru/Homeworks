package module9_java_advanced_coding.ex_39_competition;

import java.util.Random;

class Updater implements Runnable {

    private int lastResult = -1;
    private CompetitionResultsStorage storage;
    private Random random = new Random();
    private int sleep;

    public Updater(CompetitionResultsStorage storage, int sleep) {
        this.storage = storage;
        this.sleep = sleep;
    }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(sleep);
                Integer newResult = generateResult();
                storage.update(newResult, lastResult);
                lastResult = newResult;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private int generateResult() {
        return random.nextInt(100);
    }
}
