package CollectionFramework;
import Introduction.TypeCasting;

import java.util.HashMap;
public class HP {

    public static void main(String[] args) {
        //Key and Value

        HashMap<String , Float> map=new HashMap<>();

        //Country(key), Population(value)

        map.put("India", 1.4F);
        map.put("China", 1.4F);
        map.put("US", 0.33F);
        System.out.println(map);
        map.put("US", 0.32F);
        System.out.println(map);

        if(map.containsKey("China")){
            System.out.println("China is in list");

        }
        else System.out.println("China is not in list");

        System.out.println(map.get("China"));
        System.out.println(map.size());
//        for(String i=map.get){
//        }


        //Iteration
        //key
        for (String i: map.keySet()){
            System.out.print(i+" ");
        }
        System.out.println();
        // value
        for(float i: map.values())
        {
            System.out.print(i+" ");
        }
        System.out.println();

        //key and value
        for (String i: map.keySet()){
            System.out.print("key: "+i+" Value "+ map.get(i)+" ");
        }

        //print key and value set
        System.out.println(map.keySet());
        System.out.println(map.values());

    }

}
