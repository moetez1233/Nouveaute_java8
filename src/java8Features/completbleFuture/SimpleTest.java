package java8Features.completbleFuture;

import java.util.concurrent.CompletableFuture;
import java.util.logging.Logger;

public class SimpleTest {
    private static Logger logger=Logger.getLogger(SimpleTest.class.getName());
    public static void main(String[] args){
        CompletableFuture<String> x = new CompletableFuture<>();
        System.out.println(x.isDone());
        x.complete("complete manuely");
        try{
            String name =x.get();
            logger.info(name);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        // we can also do with join to have the same result so the difference is in the exception
        String name1=x.join();
        logger.info(name1);


    }

}
