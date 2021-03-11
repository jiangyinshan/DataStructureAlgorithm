import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
    public static void main(String[] args){
        HashSet hashSet = new HashSet();
        hashSet.add("星期一");
        hashSet.add("星期二");
        hashSet.add("星期三");
        hashSet.add("星期四");
        hashSet.add("星期五");
        System.out.println(hashSet);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    }
