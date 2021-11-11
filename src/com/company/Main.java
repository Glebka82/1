package com.company;

public class Main {

    public static void main(String[] args) {
        Model m=new Model();
        Controller c=new Controller();
        View view=new View();
        m.x=10;
        m.y=20;
        int result=c.summ(m.x,m.y);
        view.displey(result);

    }
}
