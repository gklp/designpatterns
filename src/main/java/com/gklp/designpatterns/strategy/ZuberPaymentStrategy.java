package com.gklp.designpatterns.strategy;

import com.gklp.designpatterns.strategy.support.PaymentResult;
import com.gklp.designpatterns.strategy.support.PaymentStrategy;
import com.gklp.designpatterns.strategy.support.Status;
import org.springframework.stereotype.Component;

@Component
public class ZuberPaymentStrategy implements PaymentStrategy {

    @Override
    public PaymentResult pay() {
        PaymentResult paymentResult = new PaymentResult();
        paymentResult.setStatus(Status.ERROR);
        paymentResult.setStatusDescription("Zuber sisteminde hata olduğu için ödeme gerçekleşmedi.");
        return paymentResult;
    }

    @Override
    public String getPaymentType() {
        return "zuber";
    }

}
