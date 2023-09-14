package java8Features.lambdaExpr;

import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;

public class simpleTest {

    public static int calculer(int x,int y,Operation operation){
        return operation.calc(x,y);
    }
    public static Integer calculerWithFunctionIn(int x, int y, BiFunction<Integer,Integer,Integer> operation){
        return operation.apply(x,y);
    }

    public static void main(String[] args){
        Operation somme = ( x, y ) -> x+y;
        Operation substract = ( x, y) -> x -y;
        BiFunction<Integer,Integer,Integer> sumBiFunc = (x,y)-> x+y;

        Integer ssommBiFunction = calculerWithFunctionIn(2,3,sumBiFunc);
        int sommeRes = calculer(2,8,somme);
        int subRes = calculer(2,8,substract);
    }
}
