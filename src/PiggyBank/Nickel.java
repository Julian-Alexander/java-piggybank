package PiggyBank;

public class Nickel implements Money
{
    private double value = 0.05;
    private int amount;

    public Nickel()
    {
        amount = 1;
    }

    public Nickel(int amount)
    {
        this.amount = amount;
    }

    @Override
    public double getValue()
    {
        return value * amount;
    }

    @Override
    public String getAmount()
    {
//        return "$" + getValue() + " -- " + amount + " Nickels";
        return amount + " Nickel";
    }
}