package Exercise;

import java.util.List;

public class ExercisesWithFactorial {

    //Вычисление рекурсивного факториала
    public static int recurseFactorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }

    //Вычисление нерекурсивного факториала
    public static int nonRecurseFactorial(int m) {
        int result = 1;
        for (; m > 1; result *= m--);
        return result;
    }


    //Вычисление факториала с помощью Stream
    public static int streamFactorial() {
        List<Integer> myList = List.of(1, 2, 3, 4, 5, 6 );
         int result = myList.stream().reduce((accumulate, element) ->accumulate*element).get();
         return result;
    }

    public static void main(String[] args) {
        System.out.println(recurseFactorial(5));
        System.out.println(nonRecurseFactorial(4));
        System.out.println(streamFactorial());
    }
}
