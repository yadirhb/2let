package edu.mum.cs.waa.service;

import edu.mum.cs.waa.domain.Subscription;
import edu.mum.cs.waa.domain.SubscriptionType;

import javax.validation.Valid;

public interface SubscriptionService {
    /**
     * Returns structured pairs with display label and internal key to identify memberships.
     */
    SubscriptionType[] getMembershipTypes();

    Subscription requestMembership(@Valid Subscription subscription);
}
