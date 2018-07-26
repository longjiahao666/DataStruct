package paixu;

import java.util.HashMap;

/**
 * Created by KPL on 2018/7/6.
 */
public class test {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1,"long");
        hashMap.put(2,"jia");
        hashMap.put(3,"hao");
        hashMap.put(4,"666");
        hashMap.put(6,"888");
        System.out.println(hashMap.get(2));
        System.out.println(hashMap.size());
    }
}

