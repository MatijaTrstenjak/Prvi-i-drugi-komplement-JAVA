package com.company;

public class Covjek<string> {

    public string ime;
    public string prezime;
    public float tezina;
    public float visina;
    public void bmi()
    {
        float v = (tezina / visina / visina) * 10000;

        if (v <= 18.5)
            System.out.println("Underweight \nBMI = " + v);

        else if (v <= 24.9 && v > 18.5)
            System.out.println("Healthy \nBMI = " + v);

        else if (v <= 29.9 && v >= 25)
            System.out.println("Overweight \nBMI = " + v);

        else if (v >= 30)
            System.out.println("Obese \nBMI = " + v);

    }
}
