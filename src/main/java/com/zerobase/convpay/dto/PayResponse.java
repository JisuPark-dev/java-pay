package com.zerobase.convpay.dto;

//내가 반환할 데이터
public class PayResponse {
    //결제 결과
    PayResult payResult;

    //결제 성공금액
    Integer paidAmount;

    public PayResponse(PayResult payResult, Integer paidAmount) {
        this.payResult = payResult;
        this.paidAmount = paidAmount;
    }

    public PayResult getPayResult() {
        return payResult;
    }

    public void setPayResult(PayResult payResult) {
        this.payResult = payResult;
    }

    public Integer getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Integer paidAmount) {
        this.paidAmount = paidAmount;
    }
}
