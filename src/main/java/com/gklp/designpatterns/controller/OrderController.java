package com.gklp.designpatterns.controller;

import com.gklp.designpatterns.controller.resource.OrderResource;
import com.gklp.designpatterns.strategy.support.PaymentResult;
import com.gklp.designpatterns.strategy.support.PaymentStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("payment")
public class OrderController {

    @Autowired
    private List<PaymentStrategy> paymentStrategies;

    @GetMapping("{type}")
    public OrderResource makeOrder(@PathVariable String type) {
        PaymentResult paymentResult = paymentStrategies.stream()
                .filter(d -> d.getPaymentType().equals(type))
                .findFirst()
                .get()
                .pay();

        OrderResource resource = new OrderResource();
        resource.setPaymentResult(paymentResult);

        return resource;
    }

}
