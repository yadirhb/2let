package edu.mum.cs.waa.service.impl;

import edu.mum.cs.waa.domain.Area;
import edu.mum.cs.waa.repository.AreaRepository;
import edu.mum.cs.waa.service.AreaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AreaServiceImpl implements AreaService {

    private AreaRepository areaRepository;

    public AreaServiceImpl(AreaRepository areaRepository) {
        super();
        this.areaRepository = areaRepository;
    }

    @Override
    public Area save(Area area) {
        return areaRepository.save(area);
    }

    @Override
    public List<Area> findAll() {
        return (List<Area>) areaRepository.findAll();
    }

    @Override
    public Area findByAreaID(Long areaId) {
        return areaRepository.findByAreaId(areaId);
    }
}
