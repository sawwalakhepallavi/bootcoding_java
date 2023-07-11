package com.bootcoding.hashmap;

import java.util.HashMap;

public class FindDuplicate {
    public static void main(String[] args) {
        int []arr={5,10,5,10,15,5};
        FindDuplicate fd=new FindDuplicate();
        System.out.println(fd.dupliFind(arr));
    }
    public int dupliFind(int []arr) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i<n; i++) {
            if (countMap.containsKey(arr[i])) {
                int v = countMap.get(arr[i]);
                countMap.put(arr[i], v + 1);
            }
            else {
                countMap.put(arr[i], 1);
            }
        }
        int count=0;
        for(Integer value:countMap.values()){
            if(value>1){
                count++;
            }
        }
        return count;
    }


}
