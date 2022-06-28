package com.syntax.class22;

public class TestCreditCard {
    public static void main(String[] args) {


        CreditCard CC = new CreditCard();
        CC.calcInt(5000, 0.2);

        Visa VCC = new Visa();
        VCC.calcInt(3000,0.5);

        AX ACC = new AX();
        ACC.calcInt(2000,0.1);
    }

}
