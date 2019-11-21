package edu.mum.cs.waa.service;

import edu.mum.cs.waa.domain.Area;
import edu.mum.cs.waa.domain.Chain;

import java.util.List;

public interface ChainService {

    Chain save(Chain chain);

    List<Chain> findAll();
    long findChainNumber();

    Chain findByChainID(Long chainId);
}
