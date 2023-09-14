package java8Features.referenceMethodes;

public class ReferenceMethod {
    ReferenceMethod(){
        System.out.println("reference à un constructeur");
    }
    public static void showMsg(){
        System.out.println("reference static Methode");
    }

    public void alertMsg(){
        System.out.println("reference instance methode not static");
    }

    public static void main(String[] ags){
        // reference constructeur
        Msg msgConstruct=ReferenceMethod::new;
        msgConstruct.show();
        // reference static methode
        Msg  msg= ReferenceMethod::showMsg;
        msg.show();
        // reference non static methode
        ReferenceMethod referenceMethod=new ReferenceMethod();
        Msg msg1= referenceMethod::alertMsg;
        msg1.show();



    }
}
