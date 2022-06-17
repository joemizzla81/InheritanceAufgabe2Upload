package org.example;

public class Krankenwagen extends Auto
{
    boolean blaulicht;

    Krankenwagen(double position,double speed)
    {
        super(position,speed);
    }
    public void switchOnBlaulicht()
    {
        blaulicht = true;
    }
    public void switchOffBlaulich()
    {
        blaulicht = false;
    }

}


