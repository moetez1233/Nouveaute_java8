package java8Features.interfaceFuncti;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestFunctionalInterface {
    // Predicate interface take param and return boolean
    public static boolean testPredicate(Predicate<Integer> predicate,Integer x){
        return predicate.test(x);
    }
    // Function take param  and return variable
    public static Integer testFunction(Function<Integer, Integer> function) {
        return function.apply(5);
    }
    // Consumer interface take one param and don't have return, is void
    public static void testConsumer(Consumer<Integer> consumer){
        consumer.accept(5);
    }
    // Supplier interface don't have param and have return
    public static Integer testSupplier(Supplier<Integer> supplier){
        return supplier.get();
    }







    public static void main(String[] args) {

        boolean resPredicate = testPredicate(m -> m>0,5); // = true
        Integer resFunction = testFunction(m -> m*2); //   =10
        testConsumer(m -> System.out.println(m*2)); // return 10
        Integer restSupplier = testSupplier(() ->5*2); // 10



    }












}
