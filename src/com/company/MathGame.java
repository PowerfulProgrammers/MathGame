package com.company;

import java.util.Comparator;

public class MathGame implements Solutions, Comparator<MathGame> {
String name;
int right;
   int wrong;
   int res;

    public MathGame() {
    }

    public MathGame(String name, int right, int wrong) {
        this.name = name;
        this.right = right;
        this.wrong = wrong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getWrong() {
        return wrong;
    }

    public void setWrong(int wrong) {
        this.wrong = wrong;
    }

    @Override
    public void Math(int a, int b, int c) {

        switch (c){
            case 0->{
                res=a+b;

                System.out.println(a+" + "+b+" = ");
            }
            case 1->{
                res=a-b;

                System.out.println(a+" - "+b+" = ");
            }
            case 2->{
                res=a*b;

                System.out.println(a+" * "+b+" = ");
            }
            case 3->{
                res=a/b;

                System.out.println(a+" / "+b+" = ");
            }
        }




    }



    @Override
    public int compare(MathGame o1, MathGame o2) {
        if (o1.right== o2.right){
            return 0;
        }
        else if (o1.right<o2.right){
            return 1;
        }
        else {
            return -1;
        }
    }
}
