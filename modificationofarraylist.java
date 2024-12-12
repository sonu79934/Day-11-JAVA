import java.util.*;
class modificationofarraylist{
    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(345);
        a.add(909);
        a.add(767);
        //adding at particular index
        a.add(1,653);
        //modifying
        a.set(2,2368);
        System.out.println(a);
    }
}