import java.util.*;

public class Trd {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<> ();
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(9);
         int max = Integer.MIN_VALUE;
         for(int i=0;i<list.size();i++){

            // 1st way to find maximum element in the list
            if(max < list.get(i)){
                max= list.get(i);
            }

            // 2nd way to find maximum element in the list
            max = Math.max(max, list.get(i));
         }
         System.out.println("Maximum element in the list is: " + max);
}
    
}
