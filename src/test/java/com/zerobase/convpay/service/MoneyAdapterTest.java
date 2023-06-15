package com.zerobase.convpay.service;

import com.zerobase.convpay.dto.PayRequest;
import org.junit.jupiter.api.Test;

import static com.zerobase.convpay.dto.ConvenienceType.G25;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MoneyAdapterTest {
    MoneyAdapter moneyAdapter = new MoneyAdapter();
    @Test
    public void money_use_success (){
        //given
        PayRequest payRequest = new PayRequest(G25, 1000);
        System.out.println("payRequest = " + payRequest);
        //when
        MoneyUseResult moneyUseResult = moneyAdapter.useMoney(payRequest.getPayAmount());
        //then
        assertThat(moneyUseResult).isEqualTo(MoneyUseResult.USE_SUCCESS);
    }

    @Test
    public void money_use_fail (){
        //given
        PayRequest payRequest = new PayRequest(G25, 1000_001);
        //when
        MoneyUseResult moneyUseResult = moneyAdapter.useMoney(payRequest.getPayAmount());
        //then
        assertThat(moneyUseResult).isEqualTo(MoneyUseResult.USE_FAIL);
    }


}