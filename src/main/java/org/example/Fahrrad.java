package org.example;

public class Fahrrad extends Fahrzeug
{
    //Attribute
    int anzahlRaeder;
    int maxGeschwindigkeit;

    //Konstructoren
    Fahrrad(double position,double speed)
    {
        super(position);
        maxGeschwindigkeit = 30;
        this.setzeGeschwindigkeit(speed);
        anzahlRaeder = 2;

    }
    //Methoden
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