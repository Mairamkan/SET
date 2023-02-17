import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer>arrayList = new ArrayList<>();
        Random random = new Random();
        int san = random.nextInt(0,20);
        int sum = random.nextInt();
        System.out.println(san);
        Set<Integer>integers = new LinkedHashSet<>();
        for (int i = 0; i <400 ; i++) {
            integers.add(i);
            ArrayList<Integer>arrayList1 = new ArrayList<>();
            arrayList1.addAll(i);

        }





//        Set<Integer>integers = new LinkedHashSet<>();
//        for (int i = 0; i <100 ; i++) {
//            integers.add(i);
//            ArrayList<Integer> arrayList = new ArrayList<>();
//            arrayList.addAll(i)
//
//        }

     //   HashSet<Integer>integers = new HashSet<>();
     //   integers.add(2);
      //  integers.add(5);
     //   integers.add(23);
    //    System.out.println(integers.contains(2));
     //   integers.remove(23);
     //  Iterator<Integer>iterator = integers.iterator();
      //   while(iterator.hasNext());
     //   System.out.println(iterator.next());
     //   System.out.println(integers);
     //   System.out.println(integers.isEmpty());

//        LinkedList<Integer>integers = new LinkedList<>();
//        integers.add(2);
//        integers.add(3);
//        integers.add(4);
//        integers.add(5);
//        System.out.println(integers);
//    }


    }
}