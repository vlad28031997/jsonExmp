package com.jsonExmp.jsonExmp;

public class Resh {
    private double ch1;
    private double ch2;
    private String op;

    public Resh(double ch1, double ch2, String op) {
        this.ch1 = ch1;
        this.ch2 = ch2;
        this.op = op;
    }

    public double getCh1() {
        return ch1;

    }

    public void setCh1(double ch1) {
        this.ch1 = ch1;
    }

    public double getCh2() {
        return ch2;
    }

    public void setCh2(double ch2) {
        this.ch2 = ch2;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public Resh() {
    }

    public double reshenie(){

        if (op.equals("*")) return ch1*ch2;
        else if (op.equals("/")) return ch1/ch2;
        else if (op.equals("-")) return ch1-ch2;
        else return ch1+ch2;

    }
}
