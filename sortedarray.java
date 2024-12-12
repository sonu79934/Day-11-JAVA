import java.util.*;
class sortedarray{
    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(45);
        a.add(91);
        a.add(17);
        a.add(12);
        Collections.sort(a);
        System.out.println(a);
    }
}