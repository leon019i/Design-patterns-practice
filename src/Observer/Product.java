package Observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
    String name;
    String availability;
    private List<Observer> observerList;


    public Product(String name) {
        this.name = name;
        observerList=new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {
        observerList.add(observer);

    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : observerList) {
            observer.update(availability);
        }
    }

    public void setAvailability(boolean available) {
        availability = available ? " Available" : " Not Available";
        notifyAllObservers();
    }
}
