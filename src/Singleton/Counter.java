package Singleton;

public class Counter {
    public int count = 0;

    private Counter() { }

    private static Counter me = null;

    public static Counter getInstance(){
        if (me ==null) {
            me = new Counter();
        }return me;
    }
    public void AddOne(){
        count++;
    }


}
