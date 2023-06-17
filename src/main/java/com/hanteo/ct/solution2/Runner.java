package com.hanteo.ct.solution2;

public class Runner {

    public static void main(String[] args) {
        CoinResolver coinResolver = new CoinResolver();

        InputForm form1 = new InputForm(
                4,
                new Integer[]{1,2,3}
        );

        int answer1 = coinResolver.resolve(form1);
        System.out.println("정답 : " + answer1);


        InputForm form2 = new InputForm(
                10,
                new Integer[]{2,5,3,6}
        );

        int answer2 = coinResolver.resolve(form2);

        System.out.println("정답 : " + answer2);


    }
}
