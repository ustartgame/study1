package com.study.entity;

public class MuiltiRadom {
    private int a;
    private int b;
    private int result;

    public MuiltiRadom(int a, int b) {
        this.a = a;
        this.b = b;
        this.result = a * b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "MuiltiRadom:" + "{ a =" + a + ",b=" + b + ",result=" + result + " }";
    }
}
