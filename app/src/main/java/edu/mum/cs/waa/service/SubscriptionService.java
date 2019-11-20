package edu.mum.cs.waa.service;

import edu.mum.cs.waa.domain.SubscriptionType;

public interface SubscriptionService {
    /**
     * Returns structured pairs with display label and internal key to identify memberships.
     */
    SubscriptionType[] getMembershipTypes();
}
