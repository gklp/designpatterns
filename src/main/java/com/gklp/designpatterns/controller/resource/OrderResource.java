package com.gklp.designpatterns.controller.resource;

import com.gklp.designpatterns.strategy.support.PaymentResult;

public class OrderResource {

    private PaymentResult paymentResult;

    public PaymentResult getPaymentResult() {
        return paymentResult;
    }

    public void setPaymentResult(PaymentResult paymentResult) {
        this.paymentResult = paymentResult;
    }
}
