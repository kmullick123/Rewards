package com.idexcel.rewardspro.Rewards.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.web.ProjectedPayload;

@ProjectedPayload
public interface EntityCustomerTemplate {
	@Value("#{target.custname}")
	String getCustname();
	@Value("#{target.total}")
	int getTotal();
	
}
