import io.vavr.collection.List;

public class Kata {

    public static int add(int x, int y){
        return x+y;
    }

    public static int multiply(int x,int y){
        return x*y;
    }

    public static int substract(int x, int y){
        return x-y;
    }

    public static double add(double x, double y){
        return x+y;
    }

    public static double multiply(double x,double y){
        return x*y;
    }

    public static double substract(double x, double y){
        return x-y;
    }


    public static void main(String[] args) {
        List<Integer> myList = List.of(1,2,3,4,5);
        List<Integer> mappedList = myList.map(integer -> {return add(integer,2);});
        List<Integer> filteredList = mappedList.filter(integer -> integer%2==0);

        System.out.println("Original list : " + myList);
        System.out.println("Mapped list :  "+ mappedList);
        System.out.println("Filtered list : "+ filteredList);

        List<Integer> mappedList2 = myList.map(integer -> {return substract(integer,2);});
        List<Integer> filteredList2 = mappedList2.filter(integer -> integer%2==0);
        System.out.println("Original list : " + myList);
        System.out.println("Mapped list :  "+ mappedList2);
        System.out.println("Filtered list : "+ filteredList2);

        List<Double>  myDoubleList = List.of(1.0,2.0,3.0,4.0);
        List<Double> doubleListMapped = myDoubleList.map(x ->x*2);
        List<Double> doubleListFiltered = doubleListMapped.filter(x -> x>5);
        System.out.println("Original list : " + myDoubleList);
        System.out.println("Mapped list :  "+ doubleListMapped);
        System.out.println("Filtered list : "+ doubleListFiltered);


    }
}
