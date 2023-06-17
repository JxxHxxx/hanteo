package com.hanteo.ct.solution2;

import lombok.Getter;

@Getter
public class InputForm {

    private final Integer sum;
    private final Integer[] coins;

    public InputForm(Integer sum, Integer[] coins) {
        this.sum = sum;
        this.coins = coins;
    }
}
