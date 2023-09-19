package java8Features.completbleFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;


public class RunAsyTest {
    private static Logger logger = Logger.getLogger(RunAsyTest.class.getName());

    public static void main(String[] args) {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            logger.info("running aync 1");
        }).thenRunAsync(() -> logger.info("running aync 2 "));
        future.join();
        logger.info("running sync");


    }
}
