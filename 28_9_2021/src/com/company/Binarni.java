package com.company;

public class Binarni {

    public String broj;

    public String prviKomplement()
    {
        String pomocniBroj = broj;
        char[] brojChar = pomocniBroj.toCharArray();
        int duzinaString;
        duzinaString = pomocniBroj.length() - 1;

        for(int i = duzinaString ; i >= 0; i--)
        {
            if (brojChar[i] == '1')
                brojChar[i] = '0';
            else
                brojChar[i] = '1';
        }
        pomocniBroj = String.valueOf(brojChar);
        return pomocniBroj;
    }

    public String drugiKomplement()
    {
        String pomocniBroj = prviKomplement();
        char[] brojChar = pomocniBroj.toCharArray();
        int duzinaString;
        duzinaString = pomocniBroj.length() - 1;

        for(int i = duzinaString; i >= 0; i--)
        {
            if(brojChar[i] == '0')
            {
                brojChar[i] = '1';
                break;
            }
            else
            {
                brojChar[i] = '0';
            }
        }

        pomocniBroj = String.valueOf(brojChar);
        return pomocniBroj;
    }
}
