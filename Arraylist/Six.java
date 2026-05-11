import java.util.*;

public class Six {

    ///Multi-dimensional arrayList
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2);
        mainList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3); list2.add(4);
        mainList.add(list2);

        // printing the 2D arraylist
        for(int i=0; i < mainList.size(); i++){
            ArrayList<Integer> currList= mainList.get(i);
            // calling first list and then printing the elements of the list
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainList);


    }
    
}
