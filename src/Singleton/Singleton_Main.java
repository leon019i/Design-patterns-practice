package Singleton;

public class Singleton_Main {
    public static void main(String args[]){
        Counter counter1 = Counter.getInstance();
        Counter counter2 = Counter.getInstance();
        
        counter1.AddOne();
        System.out.println("Counter1 : " + counter1.count);
        counter2.AddOne();
        System.out.println("Counter1 : " +counter2.count);



    }
}
