package com.idexcel.rewardspro.Rewards.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idexcel.rewardspro.Rewards.dao.CustomerDataRepository;
import com.idexcel.rewardspro.Rewards.dto.CustomerData;
import com.idexcel.rewardspro.Rewards.model.EntityCustomerTemplate;

@RestController
@RequestMapping(value = "/api/rewards")
@CrossOrigin
public class RewardsController {
	
	@Autowired
	CustomerDataRepository custData;
	
	@GetMapping
    public List<CustomerData> readData() {
		Iterable<CustomerData> findAllCustomers = custData.findAll();
		List<CustomerData> actualList = new ArrayList<>();
		findAllCustomers.iterator().forEachRemaining(actualList::add);
        return actualList;
    }
	
	@GetMapping(value = "/total-rewards")
    public List<EntityCustomerTemplate> readTotalByCustomer() {
		List<EntityCustomerTemplate> totalRewardsByUser = custData.findTotalRewardsByUser();
        return totalRewardsByUser;
    }
}
