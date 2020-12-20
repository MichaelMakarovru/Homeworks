package module9_java_advanced_coding.ex_39_competition;

import java.util.ArrayList;
import java.util.List;

class CompetitionResultsStorage {

    private List<String> results = new ArrayList<>();

    public void update(String newResult, String lastResult) {
        if (!results.isEmpty() && !lastResult.equals(results.get(results.size() - 1))) {
            System.out.println("Not verified result received.");
            System.exit(1);
        }
        System.out.println("Update received: " + newResult);
        results.add(newResult);
    }

    public String readLastResult() {
        if (results.isEmpty()) {
            return "No results so far.";
        }
        return results.get(results.size() - 1);
    }
}
