package map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();

        // 如果Map的value是包裝類型時,要用包裝類型定義的變量來接收返回值，避免基本類型因自動拆箱(調用方法)，導致空指針異常
        Integer v = map.put("程式",101);
        System.out.println(v);
        map.put("英文",100);
        map.put("數學",80);
        map.put("國文",98);
        map.put("化學",77);
        System.out.println(map);

        v = map.put("化學",88);
        System.out.println(map);  // {英文=100, 國文=98, 化學=88, 程式=101, 數學=80}
        System.out.println(v);  // 77

        v = map.get("英文");
        System.out.println(v);  // 100

        v =  map.get("文");
        System.out.println(v);  // null

        int size = map.size();
        System.out.println("size: "+size); // size: 5

        v = map.remove("英文");
        System.out.println(v);  // 100
        System.out.println(map);  // {國文=98, 化學=88, 程式=101, 數學=80}

        boolean ck = map.containsKey("數學");
        System.out.println("包含key: "+ ck);  // 包含key: true
        boolean cv = map.containsValue("123");
        System.out.println("包含value: "+ cv);  // 包含value: false

        map.clear();
        System.out.println(map);  // {}

    }

}
