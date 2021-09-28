package com.company;

public class Krug {
    public float r;

    public float povrsina()
    {
        return (float) (3.14 * r * r);
    }

    public float opseg()
    {
        return (float) (2 * r * 3.14);
    }

}
