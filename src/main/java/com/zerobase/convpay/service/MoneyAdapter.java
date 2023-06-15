package com.zerobase.convpay.service;

public class MoneyAdapter {
    public static MoneyUseResult useMoney(Integer payAmount) {
        System.out.println("payAmount = " + payAmount);
        if (payAmount > 1000_000) {
            return MoneyUseResult.USE_FAIL;
        }
        return MoneyUseResult.USE_SUCCESS;
    }

    public void useMoneyCancel() {

    }
}
