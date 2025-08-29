

import java.util.*;
public class Sumofno {

    public static void main(String[] args) {
         
        int [] arr = {10,15,15,20,10,30};
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for(int i =0;i<arr.length;i++){
              if(map.containsKey(arr[i])){
                  map.put(arr[i] , map.get(arr[i])+1);
              }           
              else {
                  map.put(arr[i],1);}
    }
        for(int key: map.keySet())
        {
            if(map.get(key)==1)
            {
                sum = sum+key;
            }
        }
        System.out.println("Sum is: "+sum);
    
}
}
