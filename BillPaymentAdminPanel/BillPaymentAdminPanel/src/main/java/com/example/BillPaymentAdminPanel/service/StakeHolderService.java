package com.example.BillPaymentAdminPanel.service;

import com.example.BillPaymentAdminPanel.model.StakeHolder;
import com.example.BillPaymentAdminPanel.repository.StakeHolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StakeHolderService {
    @Autowired
    StakeHolderRepository stakeHolderRepository;

    public void createStakeHolder(StakeHolder stakeHolder){
        stakeHolderRepository.save(stakeHolder);
    }

    public List<StakeHolder> getAll(){
        return stakeHolderRepository.findAll();
    }

    public Optional findStakeHolder(int id){
        return stakeHolderRepository.findById(id);
    }

    public void deleteStakeHolder(StakeHolder stakeHolder){
        stakeHolderRepository.delete(stakeHolder);
    }
}
