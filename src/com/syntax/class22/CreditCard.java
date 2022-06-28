package com.syntax.class22;
//Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate
// interest based on the given balance. Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
//Call the method by creating an object of each of the three classes.
public class CreditCard {

    double balance;
    double interest;

    void calcInt(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
        System.out.println("Based on balance of: $" + balance + ", total ineterest is: $" + (balance * interest));
    }
}
class Visa extends CreditCard {
}
class AX extends CreditCard {
    @Override
    void calcInt(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
        System.out.println("You are the winner of our payoff promotion. You have zero interest and zero balance!");
    }
}
