import io.vavr.Function1;
import io.vavr.collection.List;

public class Kata {

    private static Function1<Integer,Integer> multiplyBy2Plus1 = Function1.of((Integer integer) -> integer*2 + 1);

    private static Function1<Integer,Boolean> isDividableBy3 = Function1.of((Integer i) ->i%3 == 0 );
    private static Function1<Double,Boolean> isDividableBy3Double = Function1.of((Double d) ->Math.floorDiv(d.intValue(),3) == 0 );

    private static Function1<Integer,Integer> substract2 = Function1.of((Integer integer) -> integer -2 );

    private static Function1<Double,Boolean> isEven = Function1.of((Double i) -> Math.floorDiv(i.intValue(),2)== 0);

    private static Function1<Double,Double> multiplyBy2PlusOneDouble = Function1.of((Double x) -> x*2 + 1);

    private static  <T extends Number> void filterMapAndDisplay(List<T> numbersList, Function1<T,Boolean> filterFunction,Function1<T,T> mappingFunction){
        List<T> mappedList = numbersList.map(t -> mappingFunction.apply(t));
        List<T> filteredList = mappedList.filter( t-> filterFunction.apply(t) );
        numbersList.filter(t -> filterFunction.apply(t));
        System.out.println("Original list = "+ numbersList);
        System.out.println("Mapped list =  " + mappedList);
        System.out.println("Filtered list = " + filteredList);

    }


    public static void main(String[] args) {
        List<Integer> myList = List.of(1,2,3,4,5);
        filterMapAndDisplay(myList,isDividableBy3,multiplyBy2Plus1 );
        filterMapAndDisplay(myList,isDividableBy3, substract2);

        List<Double>  myDoubleList = List.of(1.0,2.0,3.0,4.0);
        filterMapAndDisplay(myDoubleList,isDividableBy3Double,multiplyBy2PlusOneDouble );
        filterMapAndDisplay(myDoubleList,isDividableBy3Double,Function1.of((Double x) -> x -2 ) );

    }
}
