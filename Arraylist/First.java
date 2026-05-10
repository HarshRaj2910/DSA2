import java.util.*;
public class First{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
    
    ArrayList<Integer> list = new ArrayList<>();
    // add elemrnts in arraylist
    list.add(1);
    list.add(12);
    list.add(14);
    list.add(16);
    list.add(10);

    list.add(2,5); // add element at index with timecomplexity of O(n)
    
    System.out.println(list);

    // get element in arraylist
    int element = list.get(2);
    System.out.println(element);

    // remove element in arraylist
    list.remove(3);
    System.out.println(list);

    // set element at index in arraylist
    list.set(2,10);
    System.out.println(list);
    

    // contains elemnt in arraylist
    boolean ans = list.contains(10);
    System.out.println(ans);

    System.out.println(list.contains(12));
    System.out.println(list.contains(14));

}
}