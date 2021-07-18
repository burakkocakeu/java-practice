package com.burakkocak.practices.java.stream;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 * @author Burak KOCAK
 * @date 7/18/2021
 */
@Slf4j
public class SortMap {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("A", 2);
        map.put("C", 1);
        map.put("B", 4);
        map.put("D", 3);

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

        // 1# Collections sort
        log.info("Sorting List by Key: ");
        Collections.sort(entryList, Comparator.comparing(Map.Entry::getKey)); // Lambda -> (o1, o2) -> o1.getKey().compareTo(o2.getKey())
        for (Map.Entry<String, Integer> entry : entryList) {
            log.info("{}={}", entry.getKey(), entry.getValue());
        }

        log.info("Sorting List by Value: ");
        Collections.sort(entryList, Comparator.comparing(Map.Entry::getValue));
        for (Map.Entry<String, Integer> entry : entryList) {
            log.info("{}={}", entry.getKey(), entry.getValue());
        }

        // 2# Stream sort
        log.info("Sorting Map by Key: ");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(key -> log.info("{}", key));

        log.info("Sorting Map by Value: ");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(value -> log.info("{}", value));

    }

}
