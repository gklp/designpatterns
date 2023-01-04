package com.gklp.designpatterns.strategy.support;

public interface PaymentStrategy {

    PaymentResult pay();

    String getPaymentType();

}
