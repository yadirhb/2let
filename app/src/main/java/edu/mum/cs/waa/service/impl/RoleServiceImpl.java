package edu.mum.cs.waa.service.impl;

import edu.mum.cs.waa.domain.Role;
import edu.mum.cs.waa.repository.RoleRepository;
import edu.mum.cs.waa.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository repository;

    @Override
    public Role getRoleByName(String name) {
        return null;
    }
}
