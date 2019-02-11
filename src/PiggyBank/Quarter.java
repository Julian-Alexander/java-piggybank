package PiggyBank;

public class Quarter implements Money
{
    private double value = 0.25;
    private int amount;

    public Quarter()
    {
        amount = 1;
    }

    public Quarter(int amount)
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
//        return "$" + getValue() + " -- " + amount + " Quarters";
        return amount + " Quarter";
    }
}