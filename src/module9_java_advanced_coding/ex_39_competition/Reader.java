package module9_java_advanced_coding.ex_39_competition;

class Reader implements Runnable {

    CompetitionResultsStorage storage;

    public Reader(CompetitionResultsStorage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println("Last result: " + storage.readLastResult());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
