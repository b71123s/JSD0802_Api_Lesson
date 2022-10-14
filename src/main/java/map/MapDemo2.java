package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("英文",100);
        map.put("數學",80);
        map.put("國文",98);
        map.put("化學",77);
        map.put("體育",59);
        map.put("中餐",73);
        map.put("西餐",54);
        map.put("混合餐",99);
        System.out.println(map);

        // set裝不重複，list可以裝重複，案需求選用
        // Collection超類

        // 遍歷方式1 拿key
        Set<String> keySet = map.keySet();
        for (String key : keySet){
            System.out.println("key: "+key);
        }

        // 遍歷方式2 拿整組
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        for (Map.Entry<String,Integer> entry:entrySet){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+":"+value);
        }

        // 遍歷方式3 拿value
        Collection<Integer> values = map.values();
        for (Integer value : values){
            System.out.println("value :"+value);
        }

        // 遍歷方式4 拿value，同上概念更簡潔
        values.forEach(value-> System.out.println("value: "+value));
        // 遍歷方式5 拿value，最精簡(但沒有印value:字樣了)
        values.forEach(System.out::println);

        // 上面map兩參的遍歷示範(b,c)可自訂
        map.forEach((k,v)-> System.out.println(k+":"+v));
    }
}
