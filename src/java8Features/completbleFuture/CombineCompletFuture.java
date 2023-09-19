package java8Features.completbleFuture;

import com.sun.deploy.security.UserDeclinedException;
import java8Features.CustomException.UserNotFoundException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class CombineCompletFuture {
    public static Logger logger=Logger.getLogger(CombineCompletFuture.class.getName());
    public static List<User> listOfUers() {
        return Arrays.asList(new User(new Long(1), "Moetez"), new User(new Long(2), "ali"));
    }
    public static  CompletableFuture<User> getUser(Long idUser) {
        return  CompletableFuture.supplyAsync(() -> {
            logger.info("future get user start ");
            return listOfUers()
                    .stream()
                    .filter(u -> u.getId().equals(new Long(idUser)))
                    .findFirst()
                    .orElseThrow(() -> new UserNotFoundException("user " + 5 + " not exist"));
        });


    }
    public static CompletableFuture<String> getName(User user){
        // some code .....
        logger.info("future get name start ");
        return CompletableFuture.supplyAsync(() -> user.getName());
    }
    public static CompletableFuture<String> showMsg(String mesg){
        logger.info("future show msg start ");
        return CompletableFuture.supplyAsync(()-> mesg);
    }

    public static void main(String[] args) {
        CompletableFuture<String> nameRes = getUser(new Long(1)).thenApply(user -> getName(user).join());
        System.out.println(nameRes.join());


        // if we have list of independent completableFuture  so we have to use ollOf or anyOff
        List<CompletableFuture<?>> list = new ArrayList<>();
        list.add(getUser(new Long(1)));
        list.add(getName(listOfUers().get(0)));
        list.add(showMsg("hello"));

        CompletableFuture<Void> completableFutureList=CompletableFuture.allOf(list.toArray(new CompletableFuture[list.size()]));
        boolean res =completableFutureList.isDone();
        System.out.println("all the future is completed ? : "+(res ? "yes":"No"));

        // the problem here is that we have  CompletableFuture<Void> no return so w can do this code to get resultes

        /*
        it's possible but not asyn
        list.forEach(v -> System.out.println(v.join()));
        */
       // Async
        CompletableFuture<List> listCompletableFuture=completableFutureList.thenApply(f ->{

            return list.stream().map(v -> v.join()).collect(Collectors.toList());
        });
        System.out.println(listCompletableFuture.join());



    }
}
