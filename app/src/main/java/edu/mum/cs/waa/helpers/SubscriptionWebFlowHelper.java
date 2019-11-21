package edu.mum.cs.waa.helpers;

import edu.mum.cs.waa.domain.Subscription;
import edu.mum.cs.waa.domain.SubscriptionType;
import edu.mum.cs.waa.domain.User;
import edu.mum.cs.waa.service.RoleService;
import edu.mum.cs.waa.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import java.util.Set;

@Component
public class SubscriptionWebFlowHelper {

    @Autowired
    private LocalValidatorFactoryBean validator;

    @Autowired
    private SubscriptionService subscriptionService;

    @Autowired
    private RoleService roleService;

    public SubscriptionType[] getMembershipTypes() {
        return subscriptionService.getMembershipTypes();
    }

    public Subscription processSubscriptionRequest(@Valid Subscription subscription) {
        Set<ConstraintViolation<Subscription>> violations = validator.validate(subscription);

        if (!violations.isEmpty()) throw new ConstraintViolationException(violations);

        User member = subscription.getMember();

        member.addRole(roleService.getRoleByName("ROLE_USER"));

        //member.setUsername();

        return subscriptionService.requestMembership(subscription);
    }

}
