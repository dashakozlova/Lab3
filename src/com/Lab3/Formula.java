package com.Lab3;

public class Formula {
    private double x;
    private double y;
    private double z;
    double result;

    /**
     *
     * @param x first value
     * @param y second value
     * @param z third value
     */
    public void set(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    void run(){
        result=Math.log(Math.pow(y,-(Math.sqrt(Math.abs(x)))))*(x-y/2)+Math.pow(Math.sin(Math.atan(z)),2);

    }
    public void print(){
        System.out.println("Your answer: "+result);
    }
}
