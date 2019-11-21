package edu.mum.cs.waa.service;

import edu.mum.cs.waa.domain.Center;

import java.util.List;

public interface CenterService {

    Center save(Center center);

    List<Center> findAll();

    Center findByCenterID(Long centerId);
}
