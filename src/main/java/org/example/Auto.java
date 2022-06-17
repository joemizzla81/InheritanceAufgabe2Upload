package org.example;

public class Auto extends Fahrzeug
{
    //Attribute
    public int anzahlRaeder;
    public int maxGeschwindigkeit;
    //Constructor
    Auto(double position,double speed,int maxGeschwindigkeit)
    {
        super(position);
        this.anzahlRaeder = 4;
        this.maxGeschwindigkeit = maxGeschwindigkeit;
        this.setzeGeschwindigkeit(speed);
    }
    Auto(double position,double speed)
    {
        super(position);
        anzahlRaeder = 4;
        maxGeschwindigkeit = 140;
        this.setzeGeschwindigkeit(speed);
    }
    //Method
    public void setzeGeschwindigkeit(double speed)
    {
        if(speed >=0 && speed <= maxGeschwindigkeit)
        {
            this.Geschwindigkeit = speed;
        }
        else
        {
            if(speed >= 0 && speed >= maxGeschwindigkeit)
            {
                this.Geschwindigkeit = maxGeschwindigkeit;
            }
            if(speed <=0)
            {
                this.Geschwindigkeit =0;
            }
        }
    }
    public int anzahlRaeder()
    {
        return anzahlRaeder;
    }
    public int maxGeschwindigkeit()
    {
        return maxGeschwindigkeit;
    }

}
