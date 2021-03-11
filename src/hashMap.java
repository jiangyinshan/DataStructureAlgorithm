import java.util.ArrayList;
import java.util.HashMap;

public class hashMap {
    public static void main(String [] args){
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(5);
        arrayList.add(6);
        hashMap.put("1","1的值");
        hashMap.put(2,"2的值");
        hashMap.put(arrayList,"arraryList");
        hashMap.putIfAbsent(2,"如果不存在就插入");
        hashMap.remove(5);
        System.out.println(hashMap.entrySet());
        System.out.println(hashMap.containsKey("2的值"));
        System.out.println(hashMap.containsKey(2));
        System.out.println(hashMap.size());
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
    }
}
