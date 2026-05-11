import java.util.*;
public class ps2 {

    // pairSum2  => storted and rotated array T.C => O(n) S.C => O(1)
    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int bp =-1; // not a valid index
        for(int i=0;i<list.size();i++){
            if(list.get(i)> list.get(i+1)){ // breaking point
                bp = i;
                break;

            }
        }
        int n=list.size();
        int lp=bp+1; // smallest element index
        int rp =bp; // largest element index

         while(lp != rp){
            if(list.get(lp)+list.get(rp)== target){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n; // to maintain circular nature
            }
            else{
                rp=(n+rp-1)%n; // to maintain circular nature
            }

            }
            return false;
         }

    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);        
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
       // int target = 10;
        System.out.println(pairSum2(list, target));
    }
    
}

