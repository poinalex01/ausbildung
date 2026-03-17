package org.example;

import java.util.HashMap;
import java.util.Map;

public class Administration {
    private Map<String, Management> map = new HashMap<>();


    public boolean add(String name) {
        if (map.containsKey(name)) {
            return false;
        }
        map.put(name, new Management(name));
        return true;
    }

    public Management get(String name) {
        return map.get(name);
    }

    public Map<String, Management> getMap() {
        return map;
    }

    @Override
    public String toString() {
        return "Administration{" + "map=" + map + '}';
    }
}
