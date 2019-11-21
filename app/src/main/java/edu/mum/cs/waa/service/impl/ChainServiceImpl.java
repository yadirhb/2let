package edu.mum.cs.waa.service.impl;

import edu.mum.cs.waa.domain.Chain;
import edu.mum.cs.waa.repository.ChainRepository;
import edu.mum.cs.waa.service.ChainService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ChainServiceImpl implements ChainService {

    private ChainRepository chainRepository;

    public ChainServiceImpl(ChainRepository chainRepository) {
        super();
        this.chainRepository = chainRepository;
    }


    @Override
    public Chain save(Chain chain) {
        return chainRepository.save(chain);
    }

    @Override
    public List<Chain> findAll() {
        return (List<Chain>) chainRepository.findAll();
    }

    @Override
    public long findChainNumber() {
        return chainRepository.count();
    }

    @Override
    public Chain findByChainID(Long chainId) {
        return chainRepository.findByChainId(chainId);
    }
}
