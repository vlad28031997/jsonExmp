package com.jsonExmp.jsonExmp;

public class Source {
    private double ch1;
    private double ch2;
    private String op;
    private boolean error=false;

    public Source(String ch1, String ch2, String op) {
        try {
            this.ch1=Integer.parseInt(ch1);
            this.ch2=Integer.parseInt(ch2);
        }
        catch (Exception e ){
            this.error=true;
        }
    }

    /* catch(NumberFormatException e) {
            this.error=true;
        } catch(NullPointerException e) {
            this.error=true;
        }*/
    public double getCh1() { return ch1; }

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

    public Source() {
    }

    public String decision(){
        if (error==true)  return "invalid numeric";
        else if (op.equals("/") & ch2 == 0) return "division error";
            else if (op.equals("*")) return String.valueOf(ch1 * ch2);
            else if (op.equals("/")) return String.valueOf(ch1 / ch2);
            else if (op.equals("-")) return String.valueOf(ch1 - ch2);
            else if (op.equals("+")) return String.valueOf(ch1 + ch2);
            else return "invalid character";

    }
}
