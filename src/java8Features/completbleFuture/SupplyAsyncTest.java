package java8Features.completbleFuture;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

public class SupplyAsyncTest {
    private static Logger logger=Logger.getLogger(SupplyAsyncTest.class.getName());
    public static void main(String [] args){
        List<Integer> list= Arrays.asList(1,2,3,4,5,87,8,9,6);
       CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "sum of list is");

        CompletableFuture<String> future1=future.thenApply((val)->{
            Integer sum = list.stream().reduce(0,(a,b) -> a+b);

            return val +" "+ sum;
        });
        String res = future1.join();
        logger.info(res);


    }
}
