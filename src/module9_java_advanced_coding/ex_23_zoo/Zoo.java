package module9_java_advanced_coding.ex_23_zoo;

import java.util.*;

class Zoo {

    private List<String> animals = new ArrayList<>();

    public void addAnimal(String animal, int count) {

        for (int i = 0; i < count; i++) {
            animals.add(animal);
        }
    }

    public int getNumberOfAllAnimals() {

        return animals.size();
    }

    public Map <String, Integer> getAnimalsCount() {

        Map<String, Integer> animalsCount = new HashMap<>();

        for (String animal : animals) {
            if (animalsCount.containsKey(animal)) {
                animalsCount.put(animal, animalsCount.get(animal) + 1);
            } else {
                animalsCount.put(animal, 1);
            }
        }

        return animalsCount;
    }

    public Map <String, Integer> getAnimalsCountSorted() {

        Map<String, Integer> result = new LinkedHashMap<>();

        Map<String, Integer> animalCount = getAnimalsCount();

        for (int i = 0; i < animalCount.size(); i++) {

            int maxCount = -1;
            String currentMaxAnimal = "";

            for (Map.Entry<String, Integer> entry : animalCount.entrySet()) {

                if (!result.containsKey(entry.getKey())) {
                    if (maxCount < entry.getValue()) {
                        maxCount = entry.getValue();
                        currentMaxAnimal = entry.getKey();
                    }
                }
            }
            result.put(currentMaxAnimal, maxCount);
        }

        return result;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + animals +
                '}';
    }
}
