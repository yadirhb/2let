package edu.mum.cs.waa.service.impl;

import edu.mum.cs.waa.domain.Center;
import edu.mum.cs.waa.repository.CenterRepository;
import edu.mum.cs.waa.service.CenterService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
@Service
@Transactional
public class CenterServiceImpl implements CenterService {

    private CenterRepository centerRepository;

    public CenterServiceImpl(CenterRepository centerRepository) {
        super();
        this.centerRepository = centerRepository;
    }

    @Override
    public Center save(Center center) {
        return centerRepository.save(center);
    }

    @Override
    public List<Center> findAll() {
        return (List<Center>) centerRepository.findAll();
    }

    @Override
    public Center findByCenterID(Long centerId) {
        return centerRepository.findByCenterId(centerId);
    }
}
