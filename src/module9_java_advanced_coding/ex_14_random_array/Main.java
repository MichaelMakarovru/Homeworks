package module9_java_advanced_coding.ex_14_random_array;

import java.util.*;
import java.util.stream.Collectors;

class Main {

    public static void main(String[] args) {

        List<Integer> list = generateList(20, 10);
        printList(list);
        System.out.println();

        List<Integer> uniqueElements = getListOfUniqueElements(list);
        System.out.println("Unique elements:");
        printList(uniqueElements);
        System.out.println();

        uniqueElements = getListOfUniqueElementsUsingSet(list);
        System.out.println("Unique elements:");
        printList(uniqueElements);
        System.out.println();

        uniqueElements = getListOfUniqueElementsUsingStreams(list);
        System.out.println("Unique elements:");
        printList(uniqueElements);
        System.out.println();

        List<Integer> repeatedElements = getListOfRepeatedElements(list);
        System.out.println("Repeated elements:");
        printList(repeatedElements);
        System.out.println();

        repeatedElements = getListOfRepeatedElementsUsingMap(list);
        System.out.println("Repeated elements:");
        printList(repeatedElements);
        System.out.println();

        List<Integer> mostFrequentElements
                = getListOfMostFrequentElements(list, 3);
        System.out.println("Most frequent elements:");
        printList(mostFrequentElements);
        System.out.println();

        List<Integer> deduplicatedList
                = getDeduplicateList(list, 20);
        System.out.println("Deduplicated list:");
        printList(deduplicatedList);
        System.out.println();

        repeatedElements = getListOfRepeatedElementsUsingMap(deduplicatedList);
        System.out.println("Repeated elements:");
        printList(repeatedElements);
        System.out.println();
    }

    public static List<Integer> generateList(int listSize, int elementBound) {

        Random random = new Random();
        List<Integer> list = new ArrayList<>(listSize);

        for (int i = 0; i < listSize; i++) {
            list.add(random.nextInt(elementBound) + 1);
        }

        return list;
    }

    public static void printList(List<Integer> list) {
        int lineSize = 1;

        for (Integer integer : list) {
            System.out.print(integer);
            if (lineSize == 20) {
                System.out.println();
                lineSize = 0;
            } else {
                System.out.print(" ");
                lineSize++;
            }
        }
    }

    public static List<Integer> getListOfUniqueElements(List<Integer> list) {

        List<Integer> uniqueElements = new ArrayList<>();

        for (Integer integer : list) {
            if (!uniqueElements.contains(integer)) {
                uniqueElements.add(integer);
            }
        }

        return uniqueElements;
    }

    public static List<Integer> getListOfUniqueElementsUsingSet
            (List<Integer> list) {

        Set<Integer> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    public static List<Integer> getListOfUniqueElementsUsingStreams
            (List<Integer> list) {

        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<Integer> getListOfRepeatedElements(List<Integer> list) {

        List<Integer> repeatedElements = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            if (repeatedElements.contains(list.get(i))) {
                continue;
            }

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    repeatedElements.add(list.get(i));
                    break;
                }
            }
        }

        return repeatedElements;
    }

    public static List<Integer> getListOfRepeatedElementsUsingMap
            (List<Integer> list) {

        Map<Integer, Integer> map = new HashMap<>();

        for (Integer integer : list) {

            if (map.containsKey(integer)) {
                map.put(integer, map.get(integer) + 1);
            } else {
                map.put(integer, 1);
            }
        }

        List<Integer> repeatedElements = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                repeatedElements.add(entry.getKey());
            }
        }
        return repeatedElements;
    }

    public static List<Integer> getListOfMostFrequentElements
            (List<Integer> list, int numberOfElements) {

        Map<Integer, Integer> map = new HashMap<>();

        for (Integer integer : list) {

            if (map.containsKey(integer)) {
                map.put(integer, map.get(integer) + 1);
            } else {
                map.put(integer, 1);
            }
        }

        Map<Integer, Integer> frequentMap = new HashMap<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (frequentMap.size() < numberOfElements) {
                frequentMap.put(entry.getKey(), entry.getValue());
            } else {
                Map.Entry<Integer, Integer> currentMinimal = null;
                for (Map.Entry<Integer, Integer> entry2 : frequentMap.entrySet()) {

                    if (currentMinimal == null) {
                        currentMinimal = entry2;
                    } else {
                        if (currentMinimal.getValue() > entry2.getValue()) {
                            currentMinimal = entry2;
                        }
                    }
                }

                if (currentMinimal != null && currentMinimal.getValue() < entry.getValue()) {
                    frequentMap.remove(currentMinimal.getKey());
                    frequentMap.put(entry.getKey(), entry.getValue());
                }
            }
        }


        List<Integer> frequentElements = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : frequentMap.entrySet()) {
            if (entry.getValue() > 1) {
                frequentElements.add(entry.getKey());
            }
        }
        return frequentElements;
    }

    public static List<Integer> getDeduplicateList(List<Integer> list, int bound) {

        List<Integer> deduplicatedList = new ArrayList<>();
        Random random = new Random();

        for (Integer integer : list) {
            if (!deduplicatedList.contains(integer)) {
                deduplicatedList.add(integer);
            } else {
                while (true) {
                    Integer current = random.nextInt(bound) + 1;
                    if (!list.contains(current) && !deduplicatedList.contains(current)) {
                        deduplicatedList.add(current);
                        break;
                    }
                }
            }
        }

        return deduplicatedList;
    }
}
