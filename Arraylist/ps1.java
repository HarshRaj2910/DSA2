import java.util.*;
public class ps1 {

    // Pairsum uusing bruteforce approach T.C => O(n^2) S.C => O(1)
    // public static boolean pairSum(ArrayList<Integer> list, int target){
    //     for(int i=0;i<list.size();i++){
    //         for(int j=i+1;j<list.size(); j++){
    //             if(list.get(i)+ list.get(j) == target){
    //                 return true;

    //             }
    //         }
    //     }
    //     return false;

    // }


    // pair sum using 2 pointer approach T.C => O(nlogn) S.C => O(1)
    public static boolean pairSum(ArrayList<Integer> list, int target){
       
        int lp=0;
        int rp=list.size()-1;

        while(lp<rp){
            if(list.get(lp)+ list.get(rp) == target){
                return true;
            }
            else if(list.get(lp)+ list.get(rp) < target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);        
        list.add(4);
        list.add(5);
        int target = 8;
       // int target = 10;
        System.out.println(pairSum(list, target));
    }
    
}
