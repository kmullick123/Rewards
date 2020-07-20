package com.idexcel.rewardspro.Rewards.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.idexcel.rewardspro.Rewards.dto.CustomerData;
import com.idexcel.rewardspro.Rewards.model.EntityCustomerTemplate;



@RepositoryRestResource
public interface CustomerDataRepository extends CrudRepository<CustomerData, Long>{
	
	@Query(value = "SELECT custname, SUM(amountspent) AS total FROM  CUSTOMER_DATA GROUP BY custname", nativeQuery = true)
	List<EntityCustomerTemplate> findTotalRewardsByUser();
}
