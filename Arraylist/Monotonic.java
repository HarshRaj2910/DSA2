import java.util.*;
public class Monotonic{
    public static boolean isMonotonic (ArrayList<Integer> list){
        boolean inc = true;
        boolean dec= true; 
        for(int i=0;i<list.size() -1;i++){
            if(list.get(i)> list.get(i+1)){
                inc = false;
            }
            if(list.get(i)< list.get(i+1)){
                dec = false;
            }
        }
        return inc || dec;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        System.out.print(isMonotonic(list)+" ");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(6);
        list2.add(5);
        list2.add(4);
        list2.add(4);
        System.out.print(isMonotonic(list2)+" ");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(3);
        list3.add(2);
        System.out.print(isMonotonic(list3));
    }
}


