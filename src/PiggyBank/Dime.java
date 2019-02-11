package PiggyBank;

public class Dime implements Money
{
    private double value = 0.10;
    private int amount;

    public Dime()
    {
        amount = 1;
    }

    public Dime(int amount)
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
//        return "$" + getValue() + " -- " + amount + " Dimes";
        return amount + " Dime";
    }
}