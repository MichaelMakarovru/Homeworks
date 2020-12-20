package module9_java_advanced_coding.ex_39_competition;

import java.util.ArrayList;
import java.util.List;

class CompetitionResultsStorage {

    private List<Integer> results = new ArrayList<>();

    public void update(Integer newResult, Integer lastResult) {
        if (!results.isEmpty() && !lastResult.equals(results.get(results.size() - 1))) {
            throw new RuntimeException("Not verified!");
        }
        results.add(newResult);
    }

    public Integer readLastResult() {
        if (results.isEmpty()) {
            return -1;
        }
        return results.get(results.size() - 1);
    }
}
