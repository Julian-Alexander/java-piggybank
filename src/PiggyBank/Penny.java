package PiggyBank;

public class Penny implements Money
{
    private double value = 0.01;
    private int amount;

    public Penny()
    {
        amount = 1;
    }

    public Penny(int amount)
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
//        return "$" + getValue() + " -- " + amount + " Pennies";
        return amount + " Penny";
    }
}