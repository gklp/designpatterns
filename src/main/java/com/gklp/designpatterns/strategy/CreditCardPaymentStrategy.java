package com.gklp.designpatterns.strategy;

import com.gklp.designpatterns.strategy.support.PaymentResult;
import com.gklp.designpatterns.strategy.support.PaymentStrategy;
import com.gklp.designpatterns.strategy.support.Status;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class CreditCardPaymentStrategy implements PaymentStrategy {

    @Override
    public PaymentResult pay() {
        PaymentResult paymentResult = new PaymentResult();
        paymentResult.setCommission(BigDecimal.TEN);
        paymentResult.setStatus(Status.PROCESSED);
        return paymentResult;
    }

    @Override
    public String getPaymentType() {
        return "cc";
    }

}
