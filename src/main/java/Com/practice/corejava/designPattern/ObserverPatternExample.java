package Com.practice.corejava.designPattern;

import java.util.ArrayList;
import java.util.List;

//Observer interface
interface Observer {
 void update(String message);
}

//Subject class
class Subject {
 private List<Observer> observers = new ArrayList<>();

 public void subscribe(Observer observer) {
     observers.add(observer);
 }

 public void unsubscribe(Observer observer) {
     observers.remove(observer);
 }

 public void notifyObservers(String message) {
     for (Observer observer : observers) {
         observer.update(message);
     }
 }
}

//Concrete Observers
class EmailSubscriber implements Observer {
 public void update(String message) {
     System.out.println("Email received: " + message);
 }
}

class SMSSubscriber implements Observer {
 public void update(String message) {
     System.out.println("SMS received: " + message);
 }
}

//Main app
public class ObserverPatternExample {
 public static void main(String[] args) {
     Subject channel = new Subject();

     Observer emailSub = new EmailSubscriber();
     Observer smsSub = new SMSSubscriber();

     channel.subscribe(emailSub);
     channel.subscribe(smsSub);

     channel.notifyObservers("New Video Uploaded!");

     channel.unsubscribe(smsSub);

     channel.notifyObservers("Live Stream Started!");
 }
}

