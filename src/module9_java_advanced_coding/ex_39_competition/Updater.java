package module9_java_advanced_coding.ex_39_competition;

import java.util.Random;

class Updater implements Runnable {

    private static String lastResult = "";
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
                synchronized (storage) {
                    String newResult = generateResult();
                    storage.update(newResult, lastResult);
                    lastResult = newResult;
                }
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private String generateResult() {
        return random.nextInt(10) + ":" + random.nextInt(10);
    }
}
