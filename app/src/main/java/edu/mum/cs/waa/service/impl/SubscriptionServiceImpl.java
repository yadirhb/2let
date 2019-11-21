package edu.mum.cs.waa.service.impl;

import edu.mum.cs.waa.domain.Subscription;
import edu.mum.cs.waa.domain.SubscriptionType;
import edu.mum.cs.waa.domain.User;
import edu.mum.cs.waa.repository.SubscriptionRepository;
import edu.mum.cs.waa.service.RoleService;
import edu.mum.cs.waa.service.SubscriptionService;
import edu.mum.cs.waa.utils.Generator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Valid;
import java.time.LocalDateTime;

@Service
@Transactional
@Component
public class SubscriptionServiceImpl implements SubscriptionService {
   /* @Autowired
    private LocalValidatorFactoryBean validator;*/

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    @Autowired
    private RoleService roleService;

    public SubscriptionServiceImpl() {
        super();
    }

    @Override
    public SubscriptionType[] getMembershipTypes() {
        return SubscriptionType.values();
    }

    @Override
    public Subscription requestMembership(@Valid Subscription subscription) {
        /*Set<ConstraintViolation<Subscription>> violations = validator.validate(subscription);
        if (!violations.isEmpty()) throw new ConstraintViolationException(violations);*/

        User member = subscription.getMember();

        member.setDateCreated(LocalDateTime.now());

        member.addRole(roleService.getRoleByName("ROLE_USER"));
        //member.setUsername(member.getEmail().split("@")[0]); // @TODO Fix this is not good at all.
        member.setPassword(Generator.generatePassword()); // Set a password

        return subscriptionRepository.save(subscription);
    }
}
