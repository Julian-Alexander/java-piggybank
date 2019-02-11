package PiggyBank;

public class Dollar implements Money
{
    private double value = 1.0;
    private int amount;

    public Dollar()
    {
        amount = 1;
    }

    public Dollar(int amount)
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
//        return "$" + getValue() + " -- " + amount + " Dollars";
        return "$"+ amount;
    }
}