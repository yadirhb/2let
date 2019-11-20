package edu.mum.cs.waa.service.impl;

import edu.mum.cs.waa.domain.SubscriptionType;
import edu.mum.cs.waa.service.SubscriptionService;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {

    @Override
    public SubscriptionType[] getMembershipTypes() {
        return SubscriptionType.values();
    }
}
