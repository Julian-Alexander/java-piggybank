package PiggyBank;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Money> PiggyBank = new ArrayList<>();
//        PiggyBank.add(new Dollar(548));
//        PiggyBank.add(new Quarter(3));
//        PiggyBank.add(new Dime(5));
//        PiggyBank.add(new Nickel(4));
//        PiggyBank.add(new Penny(5));
//        PiggyBank.add(new Dollar(6));

        PiggyBank.add(new Quarter());
        PiggyBank.add(new Dime());
        PiggyBank.add(new Dollar(5));
        PiggyBank.add(new Nickel(3));
        PiggyBank.add(new Dime(7));
        PiggyBank.add(new Dollar());
        PiggyBank.add(new Penny(10));

        double total = 0;
        for(Money m : PiggyBank)
        {
            total += m.getValue();
            System.out.println(m.getAmount());
        }
//        System.out.println("\nYour Piggy Bank has $" + total + "for you!");
        System.out.println("\nThe piggy bank holds " + "$" + total);
    }
}