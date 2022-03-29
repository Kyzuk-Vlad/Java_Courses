import Interfaces.IRating;

import javax.crypto.NullCipher;

abstract public class Rating implements IRating
{
    //Rating from 0 to 100;
    private double speed;
    private double quality;
    private double prices;

    public Rating(){ }
    public Rating(double speed, double quality,double prices)
    {
        this.speed = speed;
        this.quality = quality;
        this.prices = prices;
    }

    public void setQuality(double speed)
    {
        Double l = null;
        if (speed == l)
        {
            throw new NullPointerException("Field speed cannot be empty!(From 0 to 100)");
        } else {
            this.speed = speed;
        }
    }
    public double getQuality() { return this.speed;}


    public void setSpeed(double quality)
    {
        Double l = null;
        if (quality ==l)
        {
            throw new NullPointerException("Field quality cannot be empty!(From 0 to 100)");
        } else {
            this.quality = quality;
        }
    }
    public double getSpeed()
    {
        return this.quality;
    }

    public void setPrices(double prices)
    {
        Double l = null;
        if (prices ==l)
        {
            throw new NullPointerException("Field price cannot be empty!(From 0 to 100)");
        } else {
            this.prices = prices;
        }
    }
    public double getPrices()
    {
        return this.prices;
    }

    public static double RateSomebody (double speed,double quality,double prices)
    {
        return (speed + quality + prices)/3;
    }
}
