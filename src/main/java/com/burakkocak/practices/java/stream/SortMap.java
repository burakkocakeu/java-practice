package com.burakkocak.practices.java.stream;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

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

        log.info("Sorting Map by Key: ");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(key -> log.info("{}", key));

        log.info("Sorting Map by Value: ");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(value -> log.info("{}", value));

    }

}
