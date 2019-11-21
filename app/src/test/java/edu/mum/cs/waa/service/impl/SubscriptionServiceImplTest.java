package edu.mum.cs.waa.service.impl;

import edu.mum.cs.waa.domain.SubscriptionType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SubscriptionServiceImplTest {

    private SubscriptionServiceImpl service;

    @BeforeEach
    public void init(){
        service = new SubscriptionServiceImpl();
    }

    @Test
    void getMembershipTypes() {
        assertArrayEquals(SubscriptionType.values(), service.getMembershipTypes());
    }
}