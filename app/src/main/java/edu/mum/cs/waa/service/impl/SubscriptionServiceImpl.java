package edu.mum.cs.waa.service.impl;

import edu.mum.cs.waa.domain.Subscription;
import edu.mum.cs.waa.domain.SubscriptionType;
import edu.mum.cs.waa.repository.SubscriptionRepository;
import edu.mum.cs.waa.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Valid;

@Service
@Transactional
public class SubscriptionServiceImpl implements SubscriptionService {

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    @Override
    public SubscriptionType[] getMembershipTypes() {
        return SubscriptionType.values();
    }

    @Override
    public Subscription requestMembership(@Valid Subscription subscription) {
       /* Set<ConstraintViolation<Subscription>> violations = validator.validate(subscription);

        if (!violations.isEmpty()) throw new ConstraintViolationException(violations);*/
        return subscriptionRepository.save(subscription);
    }
}
