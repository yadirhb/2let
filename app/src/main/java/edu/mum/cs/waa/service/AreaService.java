package edu.mum.cs.waa.service;

import edu.mum.cs.waa.domain.Area;
import edu.mum.cs.waa.domain.Area;

import java.util.List;

public interface AreaService {

    Area save(Area area);

    List<Area> findAll();

    Area findByAreaID(Long areaId);
}
