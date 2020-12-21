package study;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BianLiMap {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap();
        map.put("branchName","master");
        map.put("author","liuxiang");
        map.put("update_time","2020.12.12");
        map.put("create_time","2008.12.13");
        travelBy_iterator(map);
    }
    public static void travelByMap_Entry(HashMap<String,String> map){
        //Set<Map.Entry<K, V>> entrySet();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String mapKey = entry.getKey();
            String mapValue = entry.getValue();
            System.out.println(mapKey + " : " + mapValue);
        }
    }

    public static void travelBymap_keySet(HashMap<String,String> map){
        //Set<Map.Entry<K, V>> entrySet();
        for (String mapkey : map.keySet()) {
            System.out.println(mapkey +" : " + map.get(mapkey));
        }
    }

    public static void travelBy_iterator(HashMap<String,String> map){
        Iterator<Map.Entry<String, String>> entries = map.entrySet().iterator();
//        while(entries.hasNext()){
//            Map.Entry<String, String> entry = entries.next();
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key+":"+value);
//        }

        while(entries.hasNext()){

            System.out.println(entries.next());
        }
    }

}
