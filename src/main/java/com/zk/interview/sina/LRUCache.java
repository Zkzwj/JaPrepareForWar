package com.zk.interview.sina;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author: zking
 * @Date: 2019/8/31 16:38
 * @Content:
 */
public class LRUCache {

    private LinkedHashMap<Integer, Integer> map;

    public LRUCache(int capactiy) {
        map = new LinkedHashMap<Integer, Integer>(capactiy, 0.75f, true){
            private static final long serID = 23948928349L;

            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > capactiy;
            }
        };
    }

    public int get(int key){
        return map.getOrDefault(key, -1);
    }

    public void put(int key, int value){
        map.put(key, value);
    }

}
