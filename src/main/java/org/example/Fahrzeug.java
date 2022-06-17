package org.example;

abstract public class Fahrzeug
{

    public double position;
    public double Geschwindigkeit;

    Fahrzeug(double position)
    {
        this.position = position;
    }


    public double  getPosition()
    {
        return position;

    }

    public double bewege(double min)
    {
        return this.position += this.Geschwindigkeit*(min/60.0);
    }
    abstract public int maxGeschwindigkeit();
    abstract public int anzahlRaeder();
    abstract public void setzeGeschwindigkeit(double speed);
}