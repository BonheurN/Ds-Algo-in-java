import java.util.*;
public weird_array{
    @SuppressWarnings("unchecked")
    public static List<Integer>[] arrayOfLists = new List<Integer>[] {
        Arrays.asList(1, 2, 3),
        Arrays.asList(4, 5, 6),
        Arrays.asList(7, 8, 9),
    };
    public static void main(String[]args){
        for(List<Integer> list : arrayOfLists) {
            System.out.println(list);
        }
        
    }
} 