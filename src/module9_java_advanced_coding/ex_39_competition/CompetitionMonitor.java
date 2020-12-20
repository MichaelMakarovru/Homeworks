package module9_java_advanced_coding.ex_39_competition;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class CompetitionMonitor {

    public static void main(String[] args) {

        CompetitionResultsStorage storage = new CompetitionResultsStorage();

        ExecutorService service = Executors.newFixedThreadPool(4);

        service.submit(new Reader(storage));
        service.submit(new Updater(storage, 2000));
        service.submit(new Updater(storage, 2000));
    }
}
