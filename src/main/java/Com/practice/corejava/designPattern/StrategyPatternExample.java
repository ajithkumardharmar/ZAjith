package Com.practice.corejava.designPattern;

//Strategy Interface
interface PaymentStrategy {
 void pay(int amount);
}

//Concrete Strategy 1: Credit Card Payment
class CreditCardPayment implements PaymentStrategy {
 public void pay(int amount) {
     System.out.println("Paid " + amount + " using Credit Card.");
 }
}

//Concrete Strategy 2: PayPal Payment
class PayPalPayment implements PaymentStrategy {
 public void pay(int amount) {
     System.out.println("Paid " + amount + " using PayPal.");
 }
}

//Context: A Shopping Cart using a Payment Strategy
class ShoppingCart {
 private PaymentStrategy paymentStrategy;

 // Set the strategy dynamically
 public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
     this.paymentStrategy = paymentStrategy;
 }

 public void checkout(int amount) {
     paymentStrategy.pay(amount);
 }
}

public class StrategyPatternExample {
 public static void main(String[] args) {
     // Client code that uses the strategy pattern
     ShoppingCart cart = new ShoppingCart();
     
     // Using CreditCardPayment strategy
     cart.setPaymentStrategy(new CreditCardPayment());
     cart.checkout(100);  // Output: Paid 100 using Credit Card.

     // Using PayPalPayment strategy
     cart.setPaymentStrategy(new PayPalPayment());
     cart.checkout(200);  // Output: Paid 200 using PayPal.
 }
}

